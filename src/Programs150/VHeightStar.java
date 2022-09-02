package Programs150;

import java.util.Scanner;

public class VHeightStar {
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i = n - 1; i >= 0; i--)
        {
            // outer gap loop
            for (j = n - 1; j > i; j--)
            {
                System.out.print(" ");
            }

            // 65 is ASCII of 'A'
            System.out.print("*");

            // inner gap loop
            for (j = 1; j < (i * 2); j++)
                System.out.print(" ");

            if (i >= 1)
                System.out.print("*");
            System.out.print("\n");
        }
    }
}
