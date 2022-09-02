package Programs150;

public class NoOfStepsToReduceNumToZero {
    public static void main(String[] args) {
        int num =14;
        int count =0;
        while(num!=0)
        {
            if(num%2==0){
                count++;
                num=num/2;
            }
            else if(num%2!=0){
                count++;
                num=num-1;
            }}

        System.out.println( count);
    }
}
