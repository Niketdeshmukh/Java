import java.util.Scanner;

public class MeanOfTheArrayElements {
    public static void main(String[] args) {

        System.out.println("Enter the no of elements : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Enter the elements : ");
        int[] array = new  int[num];
        int sum=0;
        for (int i = 0; i <num ; i++) {
            array[i]=sc.nextInt();
            sum+=array[i];
        }
        int mean = sum/num;
        System.out.println("The mean of the elements are : " + mean);
    }
}
