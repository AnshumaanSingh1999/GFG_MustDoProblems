import java.util.Scanner;
public class Matrix_Is_Sudoku_Valid {
    static int isValid(int mat[][]){
        int r=mat.length;
        int c=mat[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                
            }
        }


        
        return 0;
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
        System.out.println(isValid(a));   
    }   
}