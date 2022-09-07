package Hashing;

import java.util.HashMap;

public class JewelsAndStones {
    public static int checkStones(String jewels,String stones){
        HashMap<Character,Integer> map = new HashMap<>();
        int count=0;
        for (int i = 0; i < stones.length(); i++) {
         char ch=stones.charAt(i);
         if(map.containsKey(ch)){
             map.put(ch, map.get(ch)+1);
         }
         else map.put(ch,1);
        }
        for (int i = 0; i < jewels.length(); i++) {
            char ch = jewels.charAt(i);
            if (map.containsKey(ch)){
                count+=map.get(ch);
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        String jewels="aA";
        System.out.print(jewels);
        System.out.println();
        String stones="aAAbbbb";
        System.out.println(stones);
        System.out.println(checkStones(jewels,stones));
    }
}
