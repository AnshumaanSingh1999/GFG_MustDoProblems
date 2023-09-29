import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Arrays_Merge_without_Extra_Space {
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        ArrayList<Long> alt=new ArrayList<>();
        // ArrayList<Long> al1=new ArrayList<>();
        // ArrayList<Long> al2=new ArrayList<>();
        

        for(int i=0;i<n;i++){
            alt.add(arr1[i]);
        }
        for(int j=0;j<m;j++){
            alt.add(arr2[j]);    
        }
        Collections.sort(alt);
        // for(int i=0;i<n;i++){
        //     al1.add(alt.get(i));
        // }
        // for(int j=n;j<m;j++){
        //     al2.add(alt.get(j));    
        // }
        for (long x : alt){
            System.out.print(x+" ");
        }



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long arr1[]=new long[n];
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextLong();
        }
        int m=sc.nextInt();
        long arr2[]=new long[m];
        for(int j=0;j<m;j++){
            arr2[j]=sc.nextLong();
        }
        Arrays_Merge_without_Extra_Space obj=new Arrays_Merge_without_Extra_Space();
        merge(arr1, arr2, n, m);

    }
    
}
