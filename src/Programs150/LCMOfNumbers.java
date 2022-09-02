package Programs150;

import java.util.Scanner;

public class LCMOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        int max = Math.max(num1,num2);
        while (true){
            if (max%num1==0 && max%num2==0){
                System.out.println(max);
                break;
            }
            else
                max += Math.max(num1,num2);
        }
    }
}
