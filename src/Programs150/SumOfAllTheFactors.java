package Programs150;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllTheFactors {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0){
                sum+=i;
            }
        }System.out.println(sum);
    }
}