import java.util.Arrays;
import java.util.Scanner;

public class ReverseLoopPrintNum {
    public static void main(String[] args) {
        System.out.println("Enter the number how many times you wanted to print Hello World!");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
