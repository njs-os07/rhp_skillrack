package skillrack;
import java.util.*;
public class Longest_subseq {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int l1=s1.length();
        int l2=s2.length();
        int[][] dp=new int[l1+1][l2+1];
        int max=0;
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if (dp[i][j]>max){
                        max=dp[i][j];
                    }
                }
                else{
                    dp[i][j]=(dp[i][j-1]>dp[i-1][j])?dp[i][j-1]:dp[i-1][j];
                }
            }
        }
        System.out.println(max);
    }
}
