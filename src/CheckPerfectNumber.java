import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to find if it is perfect or not: " );
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum =0;
        for (int i = 1; i <num ; i++) {
            if (num%i==0){
                sum = sum + i;
            }


        }if (sum == num){
            System.out.println("The entered no is a perfect number :)");
        }
        else System.out.println("Not a perfect no");

    }
}
