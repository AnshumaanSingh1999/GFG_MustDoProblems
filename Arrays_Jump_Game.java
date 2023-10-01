import java.util.Scanner;
public class Arrays_Jump_Game {
    static int canReach(int[] A, int N) {
        int r=0;
        int s=0;
        for(int i=0;i<N;i++){
            if(A[0]!=0){
                if(s<N){
                    s=s+A[i];
                }
            }
            else if(A[0]==0){
                break;
            }
        }
        
        return(r);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int resp=canReach(a, n);
        System.out.println(resp);
    }
    
}
