/*
Problem Solved Successfully
*/
import java.util.HashMap;
import java.util.Scanner;
public class Arrays_Majority_Element {
    static int majorityElement(int a[], int size)
    {
        int max=0;
        int maxe=0;
        int me=-1;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<size;i++){
            if(hm.containsKey(a[i])){
                hm.replace(a[i], hm.get(a[i])+1);
            }
            else if(hm.containsKey(a[i])==false){
                hm.put(a[i], 1);
            }
        }
        int l=hm.size();
        for(int i=0;i<size;i++){
            if(hm.get(a[i])>max){
                max=hm.get(a[i]);
                maxe=a[i];
            }
        }
        if(max>size/2){
            me=maxe;
        }
        return me;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int resp=majorityElement(a, n);
        System.out.println(resp);
    }
}