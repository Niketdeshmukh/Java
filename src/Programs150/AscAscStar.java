package Programs150;

import java.util.Scanner;

public class AscAscStar {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
