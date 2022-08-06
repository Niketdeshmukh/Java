import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class VerifyISBNNumber {

    public static void main(String[] args) throws IOException {
        long num;
        int sum = 0, i, t, d, dNumber;
        String numString;

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        System.out.print("Enter 10-digit ISBN number: ");
        num = Long.parseLong(br.readLine());

        numString = "" + num;
        if (numString.length() != 10) {
            System.out.println("Invalid Number");
            return;
        }

        for (i = 0; i < numString.length(); i++) {
            d = Integer.parseInt(numString.substring(i, i + 1));
            dNumber = i + 1;
            t = dNumber * d;
            sum += t;
        }

        if ((sum % 11) != 0) {
            System.out.println(num + " is an Illegal ISBN Number");
        } else {
            System.out.println(num + " is a Legal ISBN Number");
        }
    }
}
