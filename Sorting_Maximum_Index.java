import java.util.Scanner;
public class Sorting_Maximum_Index {
    static int maxIndexDiff(int A[], int N) { 
        int max=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                int d=0;
                if(A[i]<=A[j] && i<=j){
                    d=j-i;
                    if(d>max){
                        max=d;
                    }
                }
            }
        }
        return max;
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