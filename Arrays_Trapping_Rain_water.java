import java.util.*;
public class Arrays_Trapping_Rain_water {
    static long trappingWater(int arr[], int n) { 
        int ll=arr[0];
        int ul=arr[n-1];
        int max_water_height=0;
        int water=0;
        int total_water=0;
        if(ll>ul){
            max_water_height=ul;
        }
        else if(ll<ul){
            max_water_height=ll;
        }
        for(int i=1;i<n-1;i++){
            water=Math.abs(max_water_height-arr[i]);
            total_water=total_water+water;
        }
        long converted_total_water=total_water;
        return converted_total_water;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long x=trappingWater(a, n);
        System.out.println(x);
    }
}
