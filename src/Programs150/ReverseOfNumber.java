package Programs150;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int digit=0;
        int num = sc.nextInt();
        while (num>0){
            digit=num%10;
            System.out.print(digit);
            num=num/10;
        }
//        System.out.print(digit);
    }
}
