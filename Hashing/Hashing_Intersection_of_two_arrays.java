/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Hashing_Intersection_of_two_arrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        int c=0;
        for(int i=0;i<n;i++){
            h1.add(a[i]);
        }
        for(int i=0;i<m;i++){
            h2.add(b[i]);
        }
        for(int x: h1){
            if(h2.contains(x)){
                c++;
            }
        }
        return c;
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
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        int resp=NumberofElementsInIntersection(a, b, n, m);
        System.out.println(resp);
    }
}