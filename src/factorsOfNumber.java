import java.util.Scanner;

public class factorsOfNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                System.out.println("The factors of the number is: "+ i);
            }

        }
    }
}
