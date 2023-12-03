/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class String_Implement_Atoi {
    static int atoi(String str){
        int num=-1;
        int l=str.length();
        int c=0;
        if(str.charAt(0)=='-'){
            c++;
        }
        for(int i=0;i<l;i++){
            char ch=str.charAt(i);
            int r=ch;
            if(r>47 && r<58){
                c++;
            }
        }
        if(c==l){
            num=Integer.parseInt(str);
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int r=atoi(s);
        System.out.println(r);
    }
}