import java.util.Scanner;
public class Hashing_Subarrays_with_sum_K {
    static int findSubArraySum(int Arr[], int N, int k){
        int s=0;
        int c=0;
        for(int i=0;i<N-1;i++){
            for(int j=i;j<N;j++){
                s=s+Arr[i]+Arr[j];
            }
            if(s==k){
                c++;
            }
        }
        return (c);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt(); 
        int num=findSubArraySum(a, l, k);
        System.out.println(num);
    }
}
