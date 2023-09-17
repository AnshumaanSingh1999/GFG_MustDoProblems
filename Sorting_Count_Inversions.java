import java.util.Scanner;
public class Sorting_Count_Inversions {
    static long inversionCount(long a[],long n){
        int l=(int) n;
        long temp=0;
        long c=0;
        for(int i=0;i<l-1;i++){
            for(int j=i+1;j<l;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    c++;
                }

            }
            
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        long a[]=new long[l];
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        for (long i : a) {
            System.out.println(i);
        }
        long x=inversionCount(a, l);
        System.out.println(x);
    }
}
