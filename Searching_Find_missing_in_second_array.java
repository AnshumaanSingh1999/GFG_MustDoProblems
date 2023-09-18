/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Searching_Find_missing_in_second_array {
    static ArrayList<Long> findMissing(long A[], long B[], int N, int M)
    {
        ArrayList<Long> notfound=new ArrayList<>();
        for(long i:A){
            int c=0;
            for(long j:B){
                if(i==j){
                    c++;
                }
            }
            if(c==0){
                notfound.add(i);
            }
        }
        return(notfound); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        int m=sc.nextInt();
        long b[]=new long[m];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        for(int j=0;j<m;j++){
            b[j]=sc.nextLong();
        }
        ArrayList<Long> foundit=findMissing(a,b ,n,m); 
        for (long iter : foundit) {
            System.out.print((int)iter+" ");
        }  
    }
}
