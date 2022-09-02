package Programs150;

import java.util.Scanner;

public class CheckTheInputSameOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the first item: ");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the second item: ");
        int b = sc.nextInt();
        System.out.println("Enter the third item: ");
        int c = sc.nextInt();

        if (a ==b && b==c&& c==a){
            System.out.println("All the items inserted are same");
        }
        else System.out.println("Not same");
        if (a==b && b==c || b==c && c==a || c==a && a==b){
            System.out.println("Any two are same not ");
        }
    }
}
