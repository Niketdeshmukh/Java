import java.util.Scanner;

public class GenderMessage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender: ");

        char gender = sc.next().charAt(0);

        if (gender == 'm' || gender == 'M')
            System.out.println("Good morning Sir ");

        else if (gender == 'f' || gender == 'F')
            System.out.println("Good morning Ma'am ");


    }
}
