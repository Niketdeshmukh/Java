import java.util.Scanner;

public class SumUptoNNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= num ; i++) {

           sum+=i;
        }
        System.out.println(sum);
    }
}
