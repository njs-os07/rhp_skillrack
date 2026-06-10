package skillrack;
import java.util.*;
public class max_sum_of_adjcells {
    static int[][] diff = {{-1, -1}, {0, -1}, {1, -1}, {1, 0},{1, 1}, {0, 1}, {-1, 1}, {-1, 0}};
    static int calculateNeighborSum(int[][] arr, int R, int C, int i, int j) {
        int sum = 0;
        for (int k = 0; k < 8; k++) {
            int ar = i + diff[k][0];
            int ac = j + diff[k][1];
            if (ar >= 0 && ac >= 0 && ar < R && ac < C) {
                sum += arr[ar][ac];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        int[][] arr = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                int sum = calculateNeighborSum(arr, R, C, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
