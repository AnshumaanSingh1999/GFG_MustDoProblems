import java.util.ArrayList;
import java.util.Scanner;
public class Math_Trailing_Zeros_in_Factorial {
    static int trailingZeroes(int N){
        long f=1;
        long r=0;
        ArrayList<Long> a1=new ArrayList<>();
        ArrayList<Long> a2=new ArrayList<>();
        for(int i=1;i<=N;i++){
            f=f*i;
        }
        System.out.println(f);
        long x=f;
        while(x>0){
            long d1=x%10;
            x=x/10;
            a1.add(d1);
        }
        while(f>0){
            long d2=f%10;
            r=r*10+d2;
            f=f/10;
        }
        System.out.println(r);
        while(r>0){
            long d3=r%10;
            r=r/10;
            a2.add(d3);
        }
        return (int)(a1.size()-a2.size());
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=trailingZeroes(n);
        System.out.println(r);
    }   
}