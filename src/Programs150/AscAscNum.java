package Programs150;

import java.util.Scanner;

public class AscAscNum {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
