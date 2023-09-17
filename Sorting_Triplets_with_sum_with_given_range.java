import java.util.*;
public class Sorting_Triplets_with_sum_with_given_range {
    static int countTriplets(int Arr[], int N, int L, int R) {
        int s=0;
        int c=0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int k=0;k<N;k++){
                    s=Arr[i]+Arr[j]+Arr[k];
                }
            }
            if(s>=L && s<=R){
                System.out.println(s);
                c++;
            }
        }
        return c;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int l=sc.nextInt();
        int r=sc.nextInt();
        int o=countTriplets(a,n,l,r);
        System.out.println(o);
    }
}
