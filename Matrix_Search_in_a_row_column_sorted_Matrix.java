import java.util.Scanner;
public class Matrix_Search_in_a_row_column_sorted_Matrix {
    static boolean search(int matrix[][], int n, int m, int x){  
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==x){
                    counter++;
                }
            }
        }
        return ((counter>0)?true:false);
	} 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int x=sc.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        boolean flag=search(a, r, c, x);
        int result=flag?1:0;
        System.out.println(result);
    }
}
