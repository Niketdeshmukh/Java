package Programs150;

public class PrimeNumber {
    public static boolean isPrime(int num){
        boolean temp = true;
        for (int i = 2; i <num; i++) {
            if (num%i==0){
                temp=false;
                break;
            }
            else temp=true;

        }
        return temp;
    }
    public static void main(String[] args) {
        int num = 8;
        System.out.println(isPrime(num));
    }
}
