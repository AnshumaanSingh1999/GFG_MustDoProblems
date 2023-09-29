/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Searching_Median_of_2_sorted_arrays_of_Different_sizes {
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<n;i++){
            ar.add(a[i]);
        }
        for(int j=0;j<m;j++){
            ar.add(b[j]);
        }
        Collections.sort(ar);
        double s=ar.size();
        double median=0;
        if(s%2!=0){
            median=ar.get((int)(s/2));
        }
        else if(s%2==0){
            double a1=(int)(s/2)-1;
            double a2=(int)s/2;
            double sum=(ar.get((int)a1)+ar.get((int)a2));
            median=sum/2;
        }
        return median;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        double x=medianOfArrays(n, m, a, b);
        System.out.println(x);
    }
}
