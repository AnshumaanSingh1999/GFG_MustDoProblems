import java.util.HashMap;
import java.util.Scanner;
public class Matrix_Row_with_max_1s {
    static int rowWithMax1s(int arr[][], int n, int m){
        // int r=arr.length;
        // int c=arr[0].length;
        HashMap<Integer,Integer> hm= new HashMap<>();
        int rowcounter=0;
        int counter;
        hm.put(-1, -1);
        for(int i=0;i<n;i++){
            rowcounter=i;
            counter=0;
            for(int j=0;j<m;j++){
                if(arr[i][j]==1){
                    counter++;
                }
            }
            hm.put(rowcounter,counter);
        }
        int rcv=0;
        int max=0;
        int maxr=0;
        for(int x: hm.keySet()){
            rcv=hm.get(x);
            if(rcv>max)
            {
                max=rcv;
                maxr=x;
            }
            else if(x==-1){
                maxr=x;
            }
        }
        return(maxr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(rowWithMax1s(a, r, c));
    } 
}
