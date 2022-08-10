import java.util.Scanner;

public class XPatternStar {
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i + j == num || i == j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
            System.out.println();
        }}
        else {
            for (int i = 1; i <=num; i++) {
                for (int j = 1; j <= num; j++) {
                    if (i + j == num || i == j) {
                        System.out.print("* ");
                    } else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
