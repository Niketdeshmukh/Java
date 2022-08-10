import java.util.Scanner;
public class HCFOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
        int min = Math.min(num1,num2);
        while (true){
            if (num1%min==0 && num2%min==0){
                System.out.println(min);
                break;
            }
            else min--;
        }
    }
}
