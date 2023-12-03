/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Matrix_Boolean_Matrix {
    static void booleanMatrix(int matrix[][]){
        int k=0;
        int l=0;
        int c=matrix[0].length;
        int r=matrix.length;
        int row[]=new int[r];
        int col[]=new int[c];
        for(int i=0;i<r;i++){
            row[i]=0;
        }
        for(int j=0;j<c;j++){
            col[j]=0;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==1){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(row[i]==1 || col[j]==1){
                    matrix[i][j]=1;
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
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