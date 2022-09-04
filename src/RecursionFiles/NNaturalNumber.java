package RecursionFiles;

public class NNaturalNumber {
    static int count=1;
    public static void nNaturalNumbers(int n){
        if (count<=n){
            System.out.println(count);
            count++;
            nNaturalNumbers(n);
        }

    }
    public static void main(String[] args) {
        int n=20;
        nNaturalNumbers(n);
    }
}
