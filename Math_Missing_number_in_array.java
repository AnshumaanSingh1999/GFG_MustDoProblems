/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class Math_Missing_number_in_array {
    static int missingNumber(int array[], int n){
        int temp=0;
        int s=0;
        int ts=0;
        int diff=0;
        for(int i=1;i<n;i++){
            s=s+array[i-1];
            ts=ts+i;
        }
        ts=ts+n;
        diff=ts-s;
        return diff;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n-1;i++){
            a[i]=sc.nextInt();
        }
        int resp=missingNumber(a, n);
        System.out.println(resp);
    }
}
