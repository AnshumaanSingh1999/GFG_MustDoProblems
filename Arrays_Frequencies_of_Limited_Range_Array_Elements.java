import java.util.Scanner;
import java.util.ArrayList;
public class Arrays_Frequencies_of_Limited_Range_Array_Elements {
    static void frequencyCount(int arr[], int N, int P){
        ArrayList<Integer> s=new ArrayList<>();
        for(int i=1;i<=P;i++){
            int c=0;
            for(int j=0;j<N;j++){
                if(arr[j]==i){
                    c++;
                }
            }
            s.add(c);
        }
        for (int x : s) {
            System.out.println(x);  
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        frequencyCount(a, n, k);
    }
}