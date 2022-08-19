public class ShopDiscount {
    public static void main(String[] args) {
        int input=200,per=0;
        if(input>=1000)
        {
            per=30;
        }else if(input>=700&& input<1000)
        {
            per=20;
        }else if(input>=500 && input<700)
        {
            per=10;
        }else {
            per=0;
        }
        float discount=input*per/100;
        System.out.println(discount);
        float amount=input-discount;
        System.out.println(amount);
    }
}
