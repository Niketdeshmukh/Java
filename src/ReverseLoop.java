import java.util.Scanner;

public class ReverseLoop {
    public static void main(String[] args) {
        System.out.println("The the value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }

    }
}
