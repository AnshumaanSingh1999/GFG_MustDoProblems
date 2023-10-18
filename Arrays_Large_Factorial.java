import java.util.ArrayList;
import java.util.Scanner;
public class Arrays_Large_Factorial {
    public long[] factorial(long a[], int n) {
        int k=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            int f=1;
            System.out.println(a[i]);
            for(long j=1;j<=a[i];j++){
                int v=(int)a[i];
                f=f*v;
            }
            al.add(f);
        }
        for(long xs:al){
            System.out.println((int)xs);
            a[k]=xs;
            k++;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        Arrays_Large_Factorial al=new Arrays_Large_Factorial();
        long na[]=al.factorial(a, n);
        for(long x:na){
            System.out.print((int)x+" ");
        }
    }
}