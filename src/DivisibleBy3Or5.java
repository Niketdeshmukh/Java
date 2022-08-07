import java.util.Scanner;

public class DivisibleBy3Or5 {
    public static void main(String[] args) {
        System.out.println("Enter the range : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i < num; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("The numbers which are divisible with 3 & 5 : " + i);
            }
        }
    }
}
