package Programs150;

import java.util.Scanner;

public class AcceptInfo {
    public static void main(String[] args) {

        System.out.println("Please enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        String age = sc.nextLine();

        System.out.println("Your name and age are:" + name + "and" + age);


    }
}
