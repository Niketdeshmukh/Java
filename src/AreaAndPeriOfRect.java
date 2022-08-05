import java.util.Scanner;

public class AreaAndPeriOfRect {
    public static void main(String[] args) {
        System.out.println("Enter the Width: ");
        Scanner sc = new Scanner(System.in);
        Float width = sc.nextFloat();
        System.out.println("Enter the Height: ");
        Float height = sc.nextFloat();

        Float area = width * height;
        System.out.println("The area of reactangle is: " + area);
        Float Peri = 2* (width+height);

        System.out.println("The Peri of reactangle is: " + Peri);


    }
}
