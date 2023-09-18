/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Arrays_Kth_element_of_two_Arrays {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        ArrayList<Integer> ar=new ArrayList<>();
        int p;
        for(int i=0;i<n;i++){
            ar.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            ar.add(arr2[j]);
        }
        Collections.sort(ar);
        if(k<=ar.size()){
            p=ar.get(k-1);
        }
        else{
            p=0;
        }
        return  p;
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
        int k=sc.nextInt();
        Arrays_Kth_element_of_two_Arrays obj=new Arrays_Kth_element_of_two_Arrays();
        long post=obj.kthElement(a, b, n, m, m);
        System.out.println(post);
    }
}
