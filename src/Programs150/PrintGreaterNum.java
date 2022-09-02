package Programs150;

import java.util.Scanner;

public class PrintGreaterNum {
    public static void main(String[] args) {
        System.out.println("Enter the first no.: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the second no.: ");
        int b = sc.nextInt();

        if (a>b){
            System.out.println("a is greater then b");
        } else if (b>a) {
            System.out.println("b is greater then a");
        }

    }
}

