import java.util.Scanner;

public class Hashing_Intersection_of_two_arrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    c++;
                }
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