import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Arrays_Stock_buy_and_sell {
    static boolean stockBuySell(int A[], int n) {
        boolean flag=false;
        int m=0,d=0;
        HashMap<Integer,Integer> ar=new HashMap<>();
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(A[j]>A[i]){
                    d=A[j]-A[i];
                    if(d>m){
                        m=d;
                        ar.put(i, j);
                    }
                }
            }
        }
        System.out.println(ar);
        int l=ar.size();
        if(l>0){
            flag=true;
        }
        // code here
        // ArrayList<Integer> ar1=new ArrayList<>();
        // ArrayList<ArrayList> ar2=new ArrayList<>();
        // ar2.add(ar1);
        // return ar2;
        return flag;
     

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = 7;
        int a[] = {100,180,260,310,40,535,695};
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        boolean resp=stockBuySell(a, n);
        int r=resp?1:0;
        System.out.println(r);
    }   
}