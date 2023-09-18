import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
public class Arrays_Frequencies_of_Limited_Range_Array_Elements {
    static void frequencyCount(int arr[], int N, int P){
        int counter;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=1;i<=P;i++){
            counter=0;
            for(int j=0;j<N;j++){
                if(i==arr[j]){
                    counter++;
                }
            }
            a.add(counter);
        }     
        Iterator x=a.iterator();
        while(x.hasNext()){
            System.out.print(x.next()+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        frequencyCount(a, n, k);
    }
}
