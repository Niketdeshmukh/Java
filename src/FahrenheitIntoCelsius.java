import java.util.Scanner;

public class FahrenheitIntoCelsius {
    public static void main(String[] args) {
        System.out.println("Enter the temperature in Fahrenheit: ");

        Scanner sc = new Scanner(System.in);
        float temp = sc.nextFloat();

        float celsius = (temp - 32) * 5/9;
        System.out.println("The converted celsius temperature is:" + celsius);
    }
}
