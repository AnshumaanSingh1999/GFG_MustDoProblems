/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class Algorithms_Bubble_Sort {
    public static void bubbleSort(int arr[], int n)
    {
        int t=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }            
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bubbleSort(a, n);
    }
}