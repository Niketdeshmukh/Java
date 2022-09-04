package Programs150;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumberOrNot {
    public static List<Integer> selfDividingNumbers(int left,int right){
        List<Integer> list= new ArrayList<>();
        for (int i = left; i <=right ; i++) {
            if(selfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
    public static boolean selfDividing(int i){
        int num=i;
        while(num>0){
            int digit=num%10;
            num = num /10;
            if(digit==0|| i%digit>0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,22));

    }
}
