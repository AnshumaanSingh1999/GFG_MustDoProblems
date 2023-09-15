import java.util.ArrayList;
import java.util.Scanner;
public class Matrix_Boolean_Matrix {
    static void booleanMatrix(int a[][]){
        int r=a.length;
        int c=a[0].length;
        // int row[]=new int[r];
        // int col[]=new int[c];
        // for (int k = 0; k < r; k++)
        //     row[k] = 0;
        // for (int l = 0; l < c; l++)
        //     col[l] = 0;
        ArrayList<Integer> rows=new ArrayList<Integer>();
        ArrayList<Integer> cols=new ArrayList<Integer>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(a[i][j]==1){
                    rows.add(i);
                    cols.add(j);
                    // row[i]=1;
                    // col[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                for(int x:rows){
                    for(int y:cols){
                        if(i==x || j==y){
                            a[i][j]=1;
                        }
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j]);
            }
            System.out.println(" ");
        }
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
        booleanMatrix(a);
    }
}