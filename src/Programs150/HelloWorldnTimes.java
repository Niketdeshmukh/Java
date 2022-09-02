package Programs150;

import java.util.Scanner;

public class HelloWorldnTimes {
    public static void main(String[] args) {
        System.out.println("Enter the number how many times you wanted to print Hello World!");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Hello World");
        }
    }
}
