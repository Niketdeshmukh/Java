package Programs150;

import java.util.Scanner;

public class PrintMessageWithValues {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum =0;
        sum = n + m ;
        System.out.println(sum);

    }
}
