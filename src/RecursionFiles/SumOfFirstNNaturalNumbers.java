package RecursionFiles;

public class SumOfFirstNNaturalNumbers {
    public static int nNaturalNumbersSum(int n){
       if (n!=0){
           return n+nNaturalNumbersSum(n-1);
       }
       else return n;
    }
    public static void main(String[] args) {
        int n=4;
        int res=nNaturalNumbersSum(n);
        System.out.println(res);
    }
}
