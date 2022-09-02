package RecursionFiles;

public class SumOfDigitsOfNumbers {
    public static int digitSum(int n){
        if (n!=0){
            int digit=n%10;
            n=n/10;
            return digit+digitSum(n);
        }
        return n;
    }
    public static void main(String[] args) {
        int n=1234;
        System.out.println(digitSum(n));
    }
}
