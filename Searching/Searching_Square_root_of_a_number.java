/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class Searching_Square_root_of_a_number {
    static long floorSqrt(long x)
    {
        double r=x;
        double a=Math.sqrt(r);
        long c=(long) a;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        System.out.println(floorSqrt(x));;
    }    
}