package Programs150;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <num; i++) {
            for (int j = num-i; j >1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j<=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
