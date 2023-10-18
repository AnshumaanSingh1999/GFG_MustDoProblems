import java.util.ArrayList;
import java.util.Scanner;
public class Arrays_Rotate_Array {
    static void rotateArr(int arr[], int d, int n)
    {
        int k=0;
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=d;i<n;i++){
            ar.add(arr[i]);
        }
        for(int i=0;i<d;i++){
            ar.add(arr[i]);  
        }
        for (int j : ar) {
            arr[k]=j;
            k++;   
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rotateArr(a,d, n);
    }
    
}