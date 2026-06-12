package skillrack;
import java.util.*;
public class sushi {
    public static int[] sort(int[] ar,int l){
        for(int i=0;i<l;i++){
            for(int j=0;j<l-i-1;j++){
                if(ar[j]>ar[j+1]){
                    int temp=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=temp;
                }
            }
        }
        return ar;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] ar1=new int[m];
        int[] ar2=new int[n];
        for(int i=0;i<m;i++){
            ar1[i]=sc.nextInt();
        }
        ar1=sort(ar1,m);
        for(int j=0;j<n;j++){
            ar2[j]=sc.nextInt();
        }
        ar2=sort(ar2,n);
        int k=m-1;
        int l=n-1;
        int co=0;
        while(l>=0 && k>=0){
            if(ar2[l]<=2*ar1[k]){
                co++;
                l--;
                k--;
            }
            else{
                l--;
            }
        }
        System.out.println(co);
    }
}
