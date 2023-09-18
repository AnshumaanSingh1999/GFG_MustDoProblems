/*
Problem Solved Successfully
*/
import java.util.Scanner;
public class Arrays_Search_an_element_in_sorted_and_rotated_array {
    static int Search(int array[], int target){
        int temp=-1;
        for(int i=0;i<array.length;i++){
            if(array[i]==target){
                temp=i;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.println(Search(a, k));  
    }
}
