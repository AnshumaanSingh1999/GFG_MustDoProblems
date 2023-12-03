import java.util.Scanner;
public class Arrays_Three_Sum_Closest {
    static int threeSumClosest(int[] array, int target)  
	{ 
        int s=0;
        int dif=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                for(int k=0;k<array.length;k++){
                    s=array[i]+array[j]+array[k];
                        
                }
            }
        }
        return 0;
	} 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        threeSumClosest(a, k);
    }
}
