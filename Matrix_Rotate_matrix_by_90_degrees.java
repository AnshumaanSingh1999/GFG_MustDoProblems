import java.util.Scanner;
public class Matrix_Rotate_matrix_by_90_degrees {
    static void rotate(int matrix[][]) 
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int a[][]=new int[m][n];
        int temp=0;
        System.out.println(m);
        System.out.println(n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=matrix[j][n-1-i];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=a[i][j];
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        rotate(a);
    }
}