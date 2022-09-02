package RecursionFiles;

public class FabonacciSeries {
    static int num1=0,num2=1,num3=0;
    public static int factOfNum(int n){
        if(n>0){
            num3=num1+num2;
            num1=num2;
            num2=num3;
            System.out.print(" "+ num3+ " ");
            factOfNum(n-1);
        }
        return n;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.print(num1+" "+ num2 + " ");
        System.out.print(factOfNum(n-2));
    }
}
