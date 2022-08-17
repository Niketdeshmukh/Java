public class StrongNumberUsingMethods {
    public static void strongNumber(int num){
        int sum = 0;
        int temp = num;
        while (num>0){
            int digit = num%10;
            int fact=1;
            for (int i = digit; i >=1 ; i--) {
                fact*=i;
            }
            sum = sum+fact;
            num=num/10;
        }
        System.out.println(sum);
        if (sum==temp){
            System.out.println("The number is strong no");
        }
        else System.out.println("not a strong number ");
    }
    public static void main(String[] args) {
        int num = 144;
        strongNumber(num);
    }
}
