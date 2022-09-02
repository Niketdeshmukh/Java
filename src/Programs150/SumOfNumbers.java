package Programs150;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        int num,digit,sum=0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while (num>0){
             digit = num%10;
             sum+=digit;
             num=num/10;
        }
        System.out.println(sum);
    }
}
