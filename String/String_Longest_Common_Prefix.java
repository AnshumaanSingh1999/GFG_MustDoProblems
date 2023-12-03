import java.util.ArrayList;
import java.util.Scanner;
public class String_Longest_Common_Prefix {
    static String longestCommonPrefix(String arr[], int n){
        String index=arr[0];
        if(index.length()!=0){
            for(int i=1;i<n;i++){
                while(arr[i].indexOf(index)==-1){
                    index=index.substring(0, index.length()-1);
                }
            }
            return index;
        }
        else{
            return " ";
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLine();
        }   
        String resp=longestCommonPrefix(a, n);
        System.out.println(resp);
    }
}