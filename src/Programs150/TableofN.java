package Programs150;

import java.util.Scanner;

public class TableofN {
    public static void main(String[] args) {
        System.out.println("Enter the number you wanted to create the table of : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int multi = num*i;
            System.out.println(num+"*"+i + "=" + multi);

        }
    }
}
