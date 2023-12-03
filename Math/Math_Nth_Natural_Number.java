import java.util.ArrayList;
import java.util.Scanner;
public class Math_Nth_Natural_Number {
    static long findNth(long N)
    {
        int c=0;
        ArrayList<Long> ar=new ArrayList<>();
        for(long i=1;i<=N;i++){
            ar.add(i);
        }
        int x0=ar.size();
        for(int i=0;i<N;i++){
            long x=ar.get(i);
            long l=ar.get(x0-1);
            while(x>0){
                long d=x%10;
                if(d==9){
                    c++;
                    ar.remove(x);
                    ar.add(l+1);
                }
                x=x/10;
            }
        }
        int w=(int)N;
        return ar.get(w-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        System.out.println(findNth(n));
    }
}