import java.util.Scanner;

public class PallindromeOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit=0;
        int sum=0;
        int temp = num;
        while (num>0){
            digit = num%10;
            sum = (sum*10)+digit;
            num/=10;
        }
        if (sum==temp) {
            System.out.println("Entered Number is palindrome");
        }
        else System.out.println("Not a palindrome");
    }
}
