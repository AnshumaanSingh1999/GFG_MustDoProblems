import java.util.ArrayList;
import java.util.Scanner;
public class Arrays_Plus_One {
    static void increment(ArrayList<Integer> arr , int N) {
        int s=1;
        for(int x:arr){
            
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        increment(a, n);
    }
}
