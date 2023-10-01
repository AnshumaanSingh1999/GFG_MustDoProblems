import java .util.*;
import javafx.util.Pair;  

public class Searching_Left_most_and_right_most_index {
    static void indexes(long v[], long x){

        int upperi=0;
        int l=v.length;
        int loweri=0;
        for(int i=0;i<l;i++){
            if(v[i]==x){
                if(i>=upperi){
                    upperi=i;
                }
            }
            else{
                upperi=-1;
            }

        }
        
        for(int i=0;i<l;i++){
            if(v[i]==x){
                loweri=i;
                break;
            }
            else{
                loweri=-1;
            }
        }
        long nl=loweri;
        long nu=upperi;

        Pair<Long, Long> p=new Pair<>(nl,nu);

        System.out.println(upperi+" "+loweri);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        long a[]=new long[l];
        for(int i=0;i<l;i++){
            a[i]=sc.nextLong();
        }
        long x=sc.nextLong();
        indexes(a, x);
    }
}