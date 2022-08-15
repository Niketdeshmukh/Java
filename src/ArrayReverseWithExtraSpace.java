import java.util.Scanner;

public class ArrayReverseWithExtraSpace {
    public static void main(String[] args) {
        System.out.println("No. of items : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array= new int[num];
        System.out.println("Enter the items : ");
        for (int i = 0; i <num ; i++) {
            array[i]= sc.nextInt();
        }
        int j = array.length-1;
        int[] newArray= new int[num];
        for (int i = 0; i <num ; i++) {
            newArray[i]= array[j--];
        }
        for (int i = 0; i < num; i++) {
            System.out.print(newArray[i]);
        }
    }
}
