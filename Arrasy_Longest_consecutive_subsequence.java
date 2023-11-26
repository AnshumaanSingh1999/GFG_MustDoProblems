import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Arrasy_Longest_consecutive_subsequence {
    static int findLongestConseqSubseq(int arr[], int N)
	{
        HashSet<Integer> hs=new HashSet<>();
        int c=0;
        int counter=1;
        int longest=1;
        Arrays.sort(arr);
        for(int i=0;i<N-1;i++){
            if(arr[i]+1==arr[i+1]){
                hs.add(arr[i]);
                hs.add(arr[i+1]);
                counter++;
            }
            else{
                longest=Math.max(counter,longest);
            }
        }
        System.out.println(hs);
        c=hs.size();
        return longest;
	}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int a[]=new int[n];
        // for(int i=0;i<n;i++){
        //     a[i]=sc.nextInt();
        // }
        int n=12;
        int a[]={34 ,2, 7, 23, 31, 38, 13, 11, 37, 19, 45, 6};
        int resp=findLongestConseqSubseq(a, n);
        System.out.println(resp);
    }
}