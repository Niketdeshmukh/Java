package Programs150;

import java.util.Scanner;

public class HarshadNumOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp=num;
        int sum = 0;

        while (num>0){
           int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        if(temp%sum==0){
            System.out.println("The number is Harshad Number");
        }
        else System.out.println("Not a harshad number");
    }
}
