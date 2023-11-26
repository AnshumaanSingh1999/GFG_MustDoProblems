import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Hashing_Intersection_of_two_arrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        ArrayList<Integer> al=new ArrayList<>();
        int c=0;
        Arrays.sort(a);
        Arrays.sort(b);
        if(n<=m){
            for(int i=0;i<n;i++){
                if(a[i]==b[i]){
                    al.add(a[i]);
                    c++;
                }
            }
        }
        else if(m<n){
            for(int j=0;j<m;j++){
                if(a[j]==b[j]){
                    al.add(a[j]);
                    c++;
                }
            }  
        }
        System.out.println(al);
        return al.size();
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