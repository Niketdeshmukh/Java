public class IsXNumberOrNot {
    public static boolean xNumber(int num){
        int sum=0;
        while (num>0||sum>9){
          if(num==0){
              num=sum;
              sum=0;
          }
          int digit=num%10;
          sum+=digit;
          num/=10;
        }
        if(sum==1)
            return true;
        return false;
    }
    public static void main(String[] args) {
        int num= 109;
        System.out.println(xNumber(num));
    }
}
