/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class Arrays_Product_array_puzzle {
    static long[] productExceptSelf(int nums[], int n) 
	{
        long a[]=new long[n];
        int k=0;
        for(int i=0;i<n;i++){
            long p=1;
            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
                else if(j!=i){
                    p=p*nums[j];
                }
            }
            a[k]=p;
            k++;
        }
        return a;
	} 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long x[]=productExceptSelf(a, n);
        for(long r:x){
            System.out.println((int)r);   
        }
    }
}
