import java.util.HashMap;
import java.util.Scanner;
public class String_Roman_Number_to_Integer {
    public int romanToDecimal(String str) {
        int r=0;
        HashMap<String,Integer> MyMap=new HashMap<>();
        MyMap.put("I",1);
        MyMap.put("V",5);  
        MyMap.put("X",10);  
        MyMap.put("L",50);  
        MyMap.put("C",100);  
        MyMap.put("D",500);  
        MyMap.put("M",1000);  
        for(String x: MyMap.keySet()){
            if(str.equalsIgnoreCase(x)){
                r=MyMap.get(x);
            }
        }
        return r;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String_Roman_Number_to_Integer obj=new String_Roman_Number_to_Integer();
        int resp=obj.romanToDecimal(s);
        System.out.println(resp);
    }
}