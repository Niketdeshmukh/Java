package Hashing;

import java.util.HashSet;

public class CheckIfNandItsDoubleExists {
    public static boolean doubleExists(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for (int a:arr){
            if (set.contains(a)){
                return true;
            }
            set.add(a*2);
            if (a%2==0){
                set.add(a/2);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(doubleExists(arr));
    }
}
