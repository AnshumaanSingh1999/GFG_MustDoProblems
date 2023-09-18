import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Arrays_Alternate_positive_and_negative_numbers {
    static void rearrange(int arr[], int n){
        int counter=0;
        ArrayList<Integer> a=new ArrayList<>();
        int pr,sr;
        for(int i=0;i<n-1;i++){
            pr=arr[i];
            sr=arr[i+1];
            if(pr>=0 && sr<0){
                counter++;
                a.add(sr);
                a.add(pr);
            }  
        }    
        System.out.println(counter); 
        Iterator x=a.iterator();
        while(x.hasNext()){
            System.out.println(x.next());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rearrange(a, n);   
    }   
}
