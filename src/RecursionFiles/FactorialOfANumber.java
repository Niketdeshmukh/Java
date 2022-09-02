package RecursionFiles;

public class FactorialOfANumber {
    public static int factOfNum(int n){
        if(n!=1){
            return n*factOfNum(n-1);
        }
        else return n;
    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(factOfNum(n));
    }
}
