import java.util.Scanner;
public class String_Validate_an_IP_Address {
    public boolean isValid(String s) {
        int c=0;
        boolean flag=false;
        String a[]=s.split("\\.");
        if(a.length!=4){
            c++;
        }
        for(String x:a){
            System.out.println(x);
        }
        for(int i=0;i<a.length;i++){
            int x=Integer.parseInt(a[i]);
            if(x>255 || x<0){
                c++;
            }   
        }
        if(c==0){
            flag=true;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String_Validate_an_IP_Address obj=new String_Validate_an_IP_Address();
        boolean r=obj.isValid(s);
        int result=r?1:0;
        System.out.println(result);
    }
}
