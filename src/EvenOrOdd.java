import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("The number is zero");
        }
        else if (num%2 ==0){
            System.out.println("the no. is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }
}
