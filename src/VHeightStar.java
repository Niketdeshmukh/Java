import java.util.Scanner;

public class VHeightStar {
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <=num ; i++) {
            for (int j = 1; j <=i ;j++) {
                System.out.print(" ");
            }
            for (int j = num-1; j>=i ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
