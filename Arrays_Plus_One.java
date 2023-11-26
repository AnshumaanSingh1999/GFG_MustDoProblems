import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Arrays_Plus_One {
    static ArrayList<Integer> increment(ArrayList<Integer> arr , int N) {
        ArrayList<Integer> a=new ArrayList<>();
        int s=1;
        long n=0;
        long nn=0;
        for(int x:arr){
            n=n*10+x;
        }
        nn=n+1;
        while(nn>0){
            long d=nn%10;
            a.add((int)d);
            nn=nn/10;
        }
        Collections.reverse(a);
        arr.clear();
        for(int i=0;i<a.size();i++){
            arr.add(a.get(i));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        ArrayList<Integer> na=increment(a, n);
        System.out.println(na);
    }
}