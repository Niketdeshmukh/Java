import java.util.Scanner;

public class XPatternStar {
    public static void main(String[] args) {
        System.out.println("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int k = num*2-1;
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= k; j++) {
                if (i==j || j==k-i+1){
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
