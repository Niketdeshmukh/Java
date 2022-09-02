package Programs150;

import java.util.Scanner;

public class FabonacciCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count to which you want to print series :");
        int count = sc.nextInt();
        int num1 = 0;int num2=1;
        System.out.print(num1 + " " + num2);
        int num3;
        for (int i=2;i<count;++i){
            num3 = num1+num2;
            System.out.print(" "+ num3 );
            num1=num2;
            num2=num3;
        }
    }
}
