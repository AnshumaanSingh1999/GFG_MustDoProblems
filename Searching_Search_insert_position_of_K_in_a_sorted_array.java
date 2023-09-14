import java.util.Arrays;
import java.util.Scanner;
public class Searching_Search_insert_position_of_K_in_a_sorted_array {
    static int searchInsertK(int Arr[],int n,int k){
        int c=0;
        for(int i=0;i<n;i++){
            if(Arr[i]==k){
                c=i;
            }
            else if(i<n-1){
                int next=Arr[i+1];
                int curent=Arr[i];
                if(k>=curent && k<=next){
                    c=i+1;
                }
            }
            else if(i==n-1){
                int curent=Arr[i];
                if(k>=curent){
                    c=i+1;
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
        int k=sc.nextInt();
        Arrays.sort(a);
        System.out.println(searchInsertK(a, n, k));
    }
}