import java.util.Scanner;

public class AutomorphicNumberOrNot {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int multi =num*num;
        int count =0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println(multi);
        int y=(int)Math.pow(10,count);
        int z=multi%y;
        System.out.println(z);
        if (z==temp){
            System.out.println("It is Automorphic number");
        }
        else System.out.println("Not a Automorphic number");
    }
}
