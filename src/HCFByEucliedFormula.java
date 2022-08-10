import java.util.Scanner;

public class HCFByEucliedFormula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.println("GCD of two numbers " + num1+ "and"+ num2 +"is : " + findGCD(num1,num2));
    }

    private static int findGCD(int num1,int num2) {
        if (num1 == 0) {
            return num2;
        } return findGCD(num2%num1, num1);

    }
}
