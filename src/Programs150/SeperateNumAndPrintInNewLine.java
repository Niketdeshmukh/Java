package Programs150;

import java.util.Scanner;

public class SeperateNumAndPrintInNewLine {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str="";

        while (num > 0) {
           int  digit = num % 10;
            str=str+digit;
            num = num / 10;
        }
        int var=Integer.parseInt(str);
        while (var > 0) {
           int digit = var % 10;
            System.out.println(digit);
            var = var / 10;
        }
    }
}
