import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Sorting_Maximum_Index {
    static int maxIndexDiff(int A[], int N) { 
        ArrayList<Integer> a=new ArrayList<>();
        int d=0;
        int md=0;
        int di=0;
        int dj=0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(A[i]<=A[j]){
                    d=j-i;
                    a.add(d);

                    // if(d>md){
                    //     md=d;
                    //     di=i;
                    //     dj=j;
                    // }
                }
            }
        }
        Collections.sort(a);

        return a.get(a.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int r=maxIndexDiff(a, n);
        System.out.println(r);

    }
    
}
