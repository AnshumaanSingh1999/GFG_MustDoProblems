import java.util.*;
public class Sorting_Triplets_with_sum_with_given_range {
    static int countTriplets(int Arr[], int N, int L, int R) {
        int c=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int s=0;
                for(int k=0;k<N;k++){
                    if(i!=j && j!=k && k!=i){
                        s=Arr[i]+Arr[j]+Arr[k];
                        if(s>=L && s<=R){
                            System.out.println(s);
                            System.out.println(Arr[i]+","+Arr[j]+","+Arr[k]);
                            c++;
                        }
                    }
                    
                }   
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