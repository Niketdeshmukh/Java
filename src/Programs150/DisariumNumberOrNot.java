package Programs150;

public class DisariumNumberOrNot {
    public static void main(String[] args) {
        int num=135;
        int sum=0;
        int length=calcLength(num);
        int temp=num;
        while(num>0){
            int digit=num%10;
            sum = sum+(int)Math.pow(digit,length--);
            num=num/10;
        }
       if(sum==temp){
           System.out.println("Disarium number");
       }
    }
    public static int calcLength(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
