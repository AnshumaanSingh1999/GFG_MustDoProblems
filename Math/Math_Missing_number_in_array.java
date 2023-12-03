/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Math_Missing_number_in_array {
    static int missingNumber(int array[], int n){
        HashMap<Integer, Integer> hm=new HashMap<>();
        ArrayList<Integer> ar=new ArrayList<>();
        int missing=0;
        for(int i=0;i<n-1;i++){
            ar.add(array[i]);
        }
        for(int i=1;i<=n;i++){
            if(ar.contains(i)==false){
                missing=i;
            }
        }
        return missing;
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
