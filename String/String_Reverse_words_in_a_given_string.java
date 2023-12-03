/*
 Problem Solved Successfully
 */
import java.util.*;
public class String_Reverse_words_in_a_given_string {
    public String ReverseWords(String s){
        String r="";
        String a[]=s.split("\\."); 
        int l=a.length;
        for(int i=l-1;i>=0;i--){
            if(i==l-1){
                r=r+a[i];
            }
            else{
                r=r+"."+a[i];
            }
        }
        return(r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String_Reverse_words_in_a_given_string obj=new String_Reverse_words_in_a_given_string();
        String ns=obj.ReverseWords(s);
        System.out.println(ns);
    }
}
