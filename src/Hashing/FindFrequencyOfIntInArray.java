package Hashing;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfIntInArray {
    public static void main(String[] args) {
        int arr[] = {2,3,2,3,3,5,7,7,8,6,6,6,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1 );
            }
        }
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }
}
