package RecursionFiles;

public class ReverseANumber {
    public static void reverseNumber(int num){
        if(num!=0){
            int digit=num%10;
            num/=10;
            System.out.print(digit);
            reverseNumber(num);
        }
    }
    public static void main(String[] args) {
        int num=1234;
        reverseNumber(num);
    }
}
