import java.util.Scanner;
public class arrays_Maximum_value_of_difference_of_a_pair_of_elements_and_their_Index {
    static int maxValue(int[] arr, int N) {
        int d=0;
        int m=0;
        for(int i=0;i<N;i++){
            int s=0;
            for(int j=0;j<N;j++){
                s=Math.abs(arr[i]-arr[j])+Math.abs(i-j);
                if(s>m){
                    m=s;
                }
            }
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(maxValue(a, n));
    }
}