import java.util.Scanner;
public class Math_A_Simple_Fraction {
    public String  fractionToDecimal(int numerator, int denominator)
    {
        String s="";
        double n=numerator;
        double d=denominator;
        double r=n/d;
        System.out.println(r);
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        Math_A_Simple_Fraction obj=new Math_A_Simple_Fraction();
        String resp=obj.fractionToDecimal(n, d);
    }   
}