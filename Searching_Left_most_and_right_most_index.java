import java .util.*;
public class Searching_Left_most_and_right_most_index {
    static void indexes(int v[], int x){
        int upperi=0;
        int loweri=v.length-1;
        for(int i=0;i<v.length;i++){
            if(v[i]==x){
                if(i>upperi){
                    upperi=i;
                }
                else if(loweri>i){
                    loweri=i;
                }
            }
        }
        System.out.println(upperi+" "+loweri);
    }
    {
        // Your code goes here
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        indexes(a, x);
    }
}
