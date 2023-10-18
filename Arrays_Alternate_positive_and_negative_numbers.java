/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Arrays_Alternate_positive_and_negative_numbers {
    static void rearrange(int arr[], int n){
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                pos.add(arr[i]);
            }
            else if(arr[i]<0){
                neg.add(arr[i]);
            }
        } 
        int lp=pos.size();
        int ln=neg.size();
        if(lp>ln){
            for(int i=0;i<lp;i++){
                if(i<ln){
                    arr[k]=pos.get(i);
                    k++;
                    arr[k]=neg.get(i);
                    k++;
                }
                else if(i>=ln){
                    arr[k]=pos.get(i);
                    k++;
                }
            }
        }
        else if(ln>lp){
            for(int i=0;i<ln;i++){
                if(i<lp){
                    arr[k]=pos.get(i);
                    k++;
                    arr[k]=neg.get(i);
                    k++;
                }
                else if(i>=lp){
                    arr[k]=neg.get(i);
                    k++;
                }
            }
        } 
        else if(ln==lp){
            for(int i=0;i<ln;i++){
                arr[k]=pos.get(i);
                k++;
                arr[k]=neg.get(i);
                k++;
            }
        }    
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        rearrange(a, n);   
    }   
}