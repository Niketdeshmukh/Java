package RecursionFiles;

public class HCFOfTwoNumbers {
    public static int hcfOfNumber(int num1,int num2){
        int min=Math.min(num1,num2);
        while (true){
            if (num1%min==0 && num2%min==0){
                return min;
            }
            else min--;
        }
    }
    public static void main(String[] args) {
        int num1=128;
        int num2=6;
        System.out.println( hcfOfNumber(num1,num2));
    }
}
