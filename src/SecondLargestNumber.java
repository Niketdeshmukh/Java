import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        System.out.println("Enter the no of elements : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i]= sc.nextInt();
        }
        int max =Math.max(array[0],array[1]);
        int smax = Math.min(array[0],array[1]);
        for (int i = 0; i < num; i++) {
            if (array[i]>max){
                smax=max;
                max=array[i];
            }
        }
        System.out.println("second max : " + smax);
    }
}
