package Programs150;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        System.out.println("Enter 1. for add"+ "2. for subtract" +"3. for multiply" +"4. for divison");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter no a : ");
        int a = sc.nextInt();
        System.out.println("Enter no b : ");
        int b = sc.nextInt();
        int result;
        switch (num){
            case 1: result=a+b;
                System.out.println("The addition for a & b is : " + result);
                break;
            case 2: result=a-b;
                System.out.println("The subtraction for a & b is : " + result);
                break;
            case 3: result=a*b;
                System.out.println("The multiplication for a & b is : " + result);
                break;
            case 4: result=a%b;
                System.out.println("The division for a & b is : " + result);
                break;
            default:
                System.out.println("Invalid number !");
                break;
        }
    }
}
