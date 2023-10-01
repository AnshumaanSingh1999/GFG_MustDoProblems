/*
Problem Solved Successfully 
*/
import java.util.Scanner;
public class Bit_Masking_Sum_of_two_integers {
    static int sum(int a , int b)
    {
        while(b!=0){
            int carry=a & b;
            a=a^b;
            b=carry<<1;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sum(a, b);
        System.out.println(x);
    }
}