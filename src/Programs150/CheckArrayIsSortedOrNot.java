package Programs150;

import java.util.Scanner;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        System.out.println("No of elements : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the elements :");
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i]=sc.nextInt();
        }
        boolean temp = true;
        for (int i = 0; i < num-1; i++){
            if (array[i]>array[i+1])
           temp = false;

        }
        System.out.println(temp);
    }
}
