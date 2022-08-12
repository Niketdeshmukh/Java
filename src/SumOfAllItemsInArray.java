import java.util.Arrays;
import java.util.Scanner;

public class SumOfAllItemsInArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the elements of array: ");
        int[] theNumber = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            theNumber[i] = sc.nextInt();
            sum+=theNumber[i];
        }
        System.out.print("The elements of the array are :" + Arrays.toString(theNumber));
        System.out.println("The sum of elements are: "+ sum);
    }
}
