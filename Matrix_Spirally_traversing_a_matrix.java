/*
Problem Solved Successfully
*/
import java.util.ArrayList;
import java.util.Scanner;
public class Matrix_Spirally_traversing_a_matrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int rs=0;
        int re=r-1;
        int cs=0;
        int ce=c-1;
        while(rs<=re && cs<=ce){
            for(int i=cs;i<=ce;i++){
                al.add(matrix[rs][i]);
            }
            rs++;
            for(int i=rs;i<=re;i++){
                al.add(matrix[i][ce]);
            }
            ce--;
            if(rs<=re){
                for(int i=ce;i>=cs;i--){
                    al.add(matrix[re][i]);
                }
                re--;
            }
            if(cs<=ce){
                for(int i=re;i>=rs;i--){
                    al.add(matrix[i][cs]);
                }
                cs++;
            }
        }
        return al;
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
        ArrayList<Integer> x=spirallyTraverse(a, r, c);
        System.out.println(x);
    }   
}