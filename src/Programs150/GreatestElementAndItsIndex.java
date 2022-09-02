package Programs150;

import java.util.Scanner;

public class GreatestElementAndItsIndex {
    public static void main(String[] args) {

        System.out.println("Enter the no of elements : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new  int[num];
        for (int i = 0; i < num; i++) {
            array[i]= sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i <num; i++) {
          if(array[i]>array[max])
            max=i;
        }
        System.out.println(array[max]+" ,"+max);
    }
}
