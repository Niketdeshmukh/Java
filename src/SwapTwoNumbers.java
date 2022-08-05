public class SwapTwoNumbers {

    static void  swapTwoNumbers(int n,int m){
        int temp =n;
        n=m;
        m=temp;
        System.out.println("Value of n is:" + n + "Value of m is:" + m );

    }

    public static void main(String[] args) {
    int m=9,n=5;
        swapTwoNumbers(n,m);
    }
}
