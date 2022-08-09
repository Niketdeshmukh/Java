import java.lang.reflect.Array;
import java.util.Scanner;

public class SumOfNegativePositiveEvenAndPositiveOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[]= new int[10];
        int negSum=0;
        int evenSum=0;
        int oddSum=0;
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Enter the items : ");
            array[i]=sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (array[i]==0){
                break;
            } else if (array[i]<0) {
                negSum+=array[i];
//                negSum+= Math.abs(array[i]);
            } else if (array[i]%2==0) {
                evenSum+=array[i];
            }
            else oddSum+=array[i];
        }
        System.out.println("Negative Sum: "+ negSum);
        System.out.println("Positive odd Sum: "+oddSum);
        System.out.println("Positive even Sum: "+ evenSum);
    }
}
