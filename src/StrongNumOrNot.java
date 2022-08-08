import java.util.Scanner;

public class StrongNumOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int temp=num;
        int sum=0;
        while(num>0){
           int digit= num%10;
           int fact=1;
            for (int i = digit; i >=1 ; i--) {
              fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        System.out.println(sum);
        if(sum==temp){
            System.out.println("The number is strong no.");
        }
    }
}
