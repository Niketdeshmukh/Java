import java.util.Scanner;

public class DecDecStar {
    public static void main(String[] args) {
        System.out.println("Enter the no: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
