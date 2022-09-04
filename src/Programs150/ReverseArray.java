package Programs150;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("No of items : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit=0;
        System.out.println("Enter the items : ");
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i]= sc.nextInt();
        }
        for (int i = num-1; i >=0; i--) {
            System.out.print(array[i]+" ");
        }

    }
}
