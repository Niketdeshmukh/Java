import java.util.Scanner;

public class AmstrongNumberOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int digit = 0;int cube=0;
        int temp =num;
        while(num>0){
            digit = num%10;
            cube+=digit*digit*digit;
            num/=10;
        }
        System.out.println(cube);
        if(cube==temp){
            System.out.println("The given number is armstrong number :) ");
        }
        else System.out.println("Not a armstrong number");
    }
}
