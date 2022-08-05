import java.util.Scanner;

public class CalcSimpleInterest {
    public static void main(String[] args) {
        System.out.println("Enter the principal amount: ");
        Scanner sc =new Scanner(System.in);

        int amt = sc.nextInt();
        System.out.println("Enter the time : ");
        int time = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        int rateOfInt = sc.nextInt();

        int simpleInterest= amt * (1 + rateOfInt*time);
        System.out.println("The Simple interest is: " + simpleInterest);

    }
}
