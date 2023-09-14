import java.util.Scanner;
public class Hashing_Key_Pair {
    static boolean test(int a[],int n,int s){
        boolean d=false;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                else{
                    c=a[i]+a[j];
                    if(c==s){
                        d=true;
                    } 
                }
            }    
        }
        return d;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean flag=test(a,n,s);
        String result=flag?"Yes":"No";
        System.out.println(result);
    }
}