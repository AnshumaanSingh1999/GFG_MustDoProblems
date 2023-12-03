import java.util.HashMap;
import java.util.Scanner;
public class Hashing_Top_K_Frequent_Elements_in_Array {
    public int[] topK(int nums[],int k){
        HashMap<Integer, Integer> h=new HashMap<>();
        int c=0;
        int l=nums.length;
        for(int i=0;i<l;i++){
            if(h.containsKey(nums[i])==false){
                h.put(nums[i], 1);
            }
            else if(h.containsKey(nums[i])){
                h.replace(nums[i], h.get(nums[i])+1);
            }
        }
        System.out.println(h);
        return nums;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int a[]=new int[l];
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        Hashing_Top_K_Frequent_Elements_in_Array obj=new Hashing_Top_K_Frequent_Elements_in_Array();
        int na[]=obj.topK(a, k);
        for (int i : na) {
            System.out.println(i);
        }
    }
}