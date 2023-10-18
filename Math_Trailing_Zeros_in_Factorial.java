import java.util.ArrayList;
import java.util.Scanner;
public class Math_Trailing_Zeros_in_Factorial {
    static int trailingZeroes(int N){
        int c=0;
        Double f=1.0;
        int d=0;
        for(int i=1;i<=N;i++){
            f=f*i;
        }
        System.out.println(f);
        // while(f>0){
        //     d=f%10;
        //     if(d==0){
        //         c++;
        //     }
        //     else{
        //         break;
        //     }
        //     f=f/10;
        // }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=trailingZeroes(n);
        System.out.println(r);
    }   
}