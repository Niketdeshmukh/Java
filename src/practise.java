import java.sql.SQLOutput;
import java.util.Scanner;

public class practise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        String res="";
        String[] arr=s.split("\\s" );
        for(int i=0;i<arr.length;i++)
        {
            if(i==arr.length-1)
            res=arr[i]+res;
            else
                res=" "+arr[i]+res;
        }
        System.out.println(res);
    }
}
