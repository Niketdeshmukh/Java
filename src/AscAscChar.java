import java.util.Scanner;

public class AscAscChar {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            char alpha = 'A';
            for (int j = 1; j <= i; j++) {

                System.out.print(alpha++ + " ");
            }
            System.out.println();
        }
    }
}
