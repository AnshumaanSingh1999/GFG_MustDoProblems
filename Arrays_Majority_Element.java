import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Arrays_Majority_Element {
    static int majorityElement(int a[], int size)
    {
        int max=0;
        int maxv=0;
        int c;
        HashSet<Integer> s=new HashSet<>();
        HashMap<Integer, Integer> m=new HashMap<>();
        for(int i=0;i<size;i++){
            s.add(a[i]);
        }
        for(int i:s){
            c=0;
            for(int j=0;j<size;j++){
                if(i==a[j]){
                    c++;
                }
            }
            if(c>max){
                max=c;
                maxv=i;
            }
        }
        if(max>size/2){
            return maxv;
        }
        else{
            return -1;
        }   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int resp=majorityElement(a, n);
        System.out.println(resp);
    }
}
