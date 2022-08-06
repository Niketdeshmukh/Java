import java.util.Scanner;

public class NumbersUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The n natural no are : ");

        for (int i = 1; i < n; i++) {
            System.out.println("n");
        }
    }
}
