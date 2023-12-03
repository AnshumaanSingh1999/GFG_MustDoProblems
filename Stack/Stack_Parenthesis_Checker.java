/*
Problem Solved Successfully
*/
import java.util.Scanner;
import java.util.Stack;
public class Stack_Parenthesis_Checker {
    static boolean ispar(String x)
    {
        Stack<Character> s=new Stack<>();
        boolean flag=false;
        int l=x.length();
        for(int i=0;i<l;i++){
            char ch=x.charAt(i);
            if(s.empty()==true){
                if(ch=='{'||ch=='['|| ch=='('){
                    s.push(ch);
                }
                else if(ch=='}' || ch==']' || ch==')'){
                    s.push(ch);
                }   
            }
            else if(s.empty()==false){
                if(ch=='}' && s.peek()=='{' || ch==']' && s.peek()=='[' || ch==')' && s.peek()=='('){
                    s.pop();
                }
                else if(ch=='{'||ch=='['|| ch=='('){
                    s.push(ch);
                }
                else if(ch=='}' || ch==']' || ch==')'){
                    s.push(ch);
                }
            }
        }
        if(s.empty()){
            flag=true;
        }
        else{
            flag=false;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean resp=ispar(s);
        System.out.println(resp);
    }   
}