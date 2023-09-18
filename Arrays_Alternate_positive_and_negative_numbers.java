import java.util.ArrayList;
import java.util.Scanner;
public class Arrays_Alternate_positive_and_negative_numbers {
    static void rearrange(int arr[], int n){
        int counter=0;
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        int k=0;
        int narr[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                a.add(arr[i]);
            }
            else if(arr[i]<0){
                b.add(arr[i]);
            }
        } 
        int ai=0;
        int bi=0;
        for(k=0;k<n;k++){
            if(k==0 || k%2==0){
                narr[k]=a.get(ai);
                ai++;
            }
            else if(k%2!=0){
                narr[k]=b.get(bi);
                bi++;
            }
        }
        System.out.println(counter); 
        for(int j=0;j<n;j++){
            System.out.println(narr[j]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int a[]=new int[n];
        int n=10;
        int a[]={-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        rearrange(a, n);   
    }   
}
