package skillrack;
import java.util.*;
public class k_and_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] lArr = new int[n];
        int[] rArr = new int[n];
        int maxTemp = 0;
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            lArr[i] = l;
            rArr[i] = r;
            if (r > maxTemp) {
                maxTemp = r;
            }
        }
        int[] dp = new int[maxTemp + 2];
        for (int i = 0; i < n; i++) {
            dp[lArr[i]]++;
            dp[rArr[i] + 1]--;
        }
        int[] prefix = new int[maxTemp + 1];
        int a = 0;
        for (int temp = 1; temp <= maxTemp; temp++) {
            a += dp[temp];
            prefix[temp] = prefix[temp - 1];
            if (a >= k) {
                prefix[temp]++;
            }
        }
        while (q-- > 0) {
            int d = sc.nextInt();
            int b = sc.nextInt();
            if (b > maxTemp) {
                b = maxTemp;
            }
            System.out.println(prefix[b] - prefix[d - 1]);
        }
        sc.close();
    }
}