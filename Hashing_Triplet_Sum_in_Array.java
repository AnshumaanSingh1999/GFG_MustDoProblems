import java.util.Scanner;
public class Hashing_Triplet_Sum_in_Array {
    static boolean find3Numbers(int A[], int n, int X) { 
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int s=0;
                
                for(int k=0;k<n;k++){
                    if(i==j || j==k || k==i){
                        continue;
                    }
                    else{
                        s=A[i]+A[j]+A[k];
                    }
                }
                if(s==X){
                    flag=true;
                }
            }
        }
        return flag;
     }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int a[]={557,217,627,358,527,358,338,272,870, 362, 897, 23, 618, 113, 718, 697, 586, 42, 424, 130, 230, 566, 560, 933};
        // int a[]=new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=s.nextInt();
        // }
        boolean r=find3Numbers(a, n, x);
        int resp=r?1:0;
        System.out.println(resp);
    }
}