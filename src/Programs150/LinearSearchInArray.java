package Programs150;

import java.util.Scanner;

public class LinearSearchInArray {
    public static void main(String[] args) {
        System.out.println("No. of items : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array= new int[num];
        System.out.println("Enter the items : ");
        for (int i = 0; i <num ; i++) {
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the Element you want to search : ");
        int elem = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (array[i]==elem) {
                System.out.println("Index of the Element is " + i);
            }
            else System.out.println("-1");
        }
    }
}
