import java.util.ArrayList;
import java.util.Scanner;
public class Hashing_Triplet_Sum_in_Array {
    static boolean find3Numbers(int A[], int n, int X) { 
        ArrayList<Integer> ar=new ArrayList<>();
        int c=0;
        for(int i=0;i<n;i++){
            ar.add(A[i]);
        }
        int d=0;
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    d=X-(A[i]+A[j]);
                    if(ar.contains(d)){
                        c++;
                    }
                }
            }
        }
        if(c>0){
            flag=true;
        }
        return flag;
     }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        // int a[]={557,217,627,358,527,358,338,272,870, 362, 897, 23, 618, 113, 718, 697, 586, 42, 424, 130, 230, 566, 560, 933};
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        boolean r=find3Numbers(a, n, x);
        int resp=r?1:0;
        System.out.println(resp);
    }
}