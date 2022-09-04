package RecursionFiles;

public class PallindromeOrNot {
    static int digit=0;
    static int sum=0;
    static int temp=153351;
    public static boolean checkPallidrome(int num){
        while (num>0){
            digit = num%10;
            sum=(sum*10)+digit;
            num/=10;
        }
        if (sum==temp){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        int num=153351;
        System.out.println(checkPallidrome(num));
    }
}
