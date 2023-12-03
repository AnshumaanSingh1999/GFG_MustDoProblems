import java.util.HashMap;
import java.util.Scanner;
public class Hashing_Key_Pair {
    static boolean test(int arr[],int n,int x){
        boolean d=false;
        HashMap<Integer,Integer> hm=new HashMap<>();
        int diff=0;
        for(int i=0;i<n;i++){
            diff=x-arr[i];
            hm.put(arr[i], diff);
        }
        for(int i=0;i<n;i++){
            diff=x-arr[i];
            if(hm.containsKey(diff)){
                d=true;
            }
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean flag=test(a,n,s);
        String result=flag?"Yes":"No";
        System.out.println(result);
    }
}