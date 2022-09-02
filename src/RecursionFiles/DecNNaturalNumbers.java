package RecursionFiles;

public class DecNNaturalNumbers {
    static int count=1;
    public static void DecNNaturalNumbers(int n){
        if (count<=n){
            System.out.println(n);
            n--;
            DecNNaturalNumbers(n);
        }

    }
    public static void main(String[] args) {
        int n=20;
        DecNNaturalNumbers(n);
    }
}
