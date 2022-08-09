import java.util.Scanner;

public class MirroredInvertedRightTriangleStar {
    public static void main(String[] args) {
        System.out.println("Enter the no : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 1; j <=num-i+1 ; j++) {
                System.out.print(" ");
            }
            System.out.println();
            for (int j = i; j > 0; j--)  {
                System.out.print("*" + " ");
            }
        }

    }
}
