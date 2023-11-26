import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting_Count_the_number_of_possible_triangles {
    static int findNumberOfTriangles(int arr[], int n)
    {
        ArrayList<Integer> x=new ArrayList<>();
        double s=0;
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                s=arr[i]*arr[i]+arr[j]*arr[j];
                int rs=(int)Math.sqrt(s);
                if(rs>arr[i] && rs>arr[j]){
                    x.add(rs);
                    System.out.println(rs);
                }
            }
        }
        for(int a:arr){
            for(int b:x){
                if(b==a){
                    c++;
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int resp=findNumberOfTriangles(a, n);
        System.out.println(resp);
    }   
}