import java.util.Arrays;
import java.util.Scanner;

public class Math_Smallest_Positive_Integer_that_can_not_be_represented_as_Sum {
    static long smallestpositive(long[] array, int n){ 
        long least=1;
        Arrays.sort(array);
        for(long i:array){
            if(least<i){
                return least;
            }
            else{
                least=least+1;
            }
        }
        return least;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long resp=smallestpositive(a, n);
        System.out.println(resp);
    }
}