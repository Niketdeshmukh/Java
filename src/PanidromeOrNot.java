import java.util.Scanner;

public class PanidromeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = "";
        while (num>0){
           int digit=num%10;
            str+=digit;
            num=num/10;
        }
        System.out.println(str);
        int var=Integer.parseInt(str);
        if (var== num){
            System.out.println("The number is palindrome :)");
        }
        else System.out.println("Not a palindrome");
    }
}
