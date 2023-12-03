/*
Problem Solved Successfully
*/
import java.util.Scanner;
import java.util.HashMap;
public class Arrays_Frequencies_of_Limited_Range_Array_Elements {
    static void frequencyCount(int arr[], int N, int P){
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<N;i++){
            if(hm.containsKey(arr[i])){
                hm.replace(arr[i], hm.get(arr[i])+1);
            }
            else if(hm.containsKey(arr[i])==false){
                hm.put(arr[i], 1);
            }
        }
        for(int i=0;i<N;i++){
            if(hm.containsKey(i+1)){
                arr[i]=hm.get(i+1);
            }
            else{
                arr[i]=0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        frequencyCount(a, n, k);
    }
}