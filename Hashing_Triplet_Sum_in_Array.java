import java.util.Scanner;
public class Hashing_Triplet_Sum_in_Array {
    static boolean find3Numbers(int A[], int n, int X) { 
        
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int s=0;
                for(int k=0;k<n;k++){
                    s=A[i]+A[j]+A[k];

                }
                if(s==X){
                    flag=true;
                }
            }
        }
    
        // Your code Here
        return flag;
     
     }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int x=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        boolean r=find3Numbers(a, n, x);
        int resp=r?1:0;
        System.out.println(resp);
    }
}
