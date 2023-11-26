import java.util.ArrayList;
import java.util.Scanner;
public class Matrix_Sort_a_2D_vector_diagonally {
    static void diagonalSort(int matrix[][], int n, int m)
    {
        ArrayList<Integer> up=new ArrayList<>();
        ArrayList<Integer> dw=new ArrayList<>();
        int mu=0;
        int md=0;
        if(m>2 && n>2){
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(i!=j){
                        if(i==0 && j==m-1){
                            
                        }
                        else if(i==n-1 && j==0){

                        }
                        else if(j>i){
                            
                        }   
                        else if(i>j){
                            if(matrix[i][j]>md){
                                md=matrix[i][j];
                            }

                        }
                    }
                }
            }
            System.out.println(md);
            System.out.println(mu);
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                System.out.println();
            }
        }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         System.out.print(matrix[i][j]+" ");

        //     }
        //     System.out.println();
        // }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        diagonalSort(a, m, n);
    }
}