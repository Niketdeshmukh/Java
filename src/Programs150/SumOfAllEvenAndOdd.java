package Programs150;

import java.util.Scanner;

public class SumOfAllEvenAndOdd {
    public static void main(String[] args) {
        System.out.println("Enter the range you want to find sun of even add odd numbers of : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum1 =0;
        int sum2 = 0;
        for (int i = 1; i <= num; i++) {

        if (i%2==0) {
            sum1+=i;
        }
       else{
            sum2+=i;
        }
        }
        System.out.println("The sum of even no is : " + sum1);
        System.out.println("The sum of odd no is : " + sum2);
    }
}
