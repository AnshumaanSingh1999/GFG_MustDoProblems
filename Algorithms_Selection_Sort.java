import java.util.Scanner;

public class Algorithms_Selection_Sort {
    int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        return 0;
	}
    static void selectionSort(int arr[], int n){
        int index=0;
        int temp=0;
        for(int i=0;i<n;i++){
            index=i;
            for(int j=0;j<n;j++){
                if(arr[index]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for()

        

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        selectionSort(a, n);   
    }   
}