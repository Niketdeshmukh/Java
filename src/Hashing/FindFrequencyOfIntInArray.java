package Hashing;

import java.util.HashMap;
import java.util.HashSet;
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

    public static class FindRepeatingElemHasing {
        public static void repeatingElem(int arr[]){
            // Initialize index of first repeating element
            int min = -1;
            HashSet<Integer> set=new HashSet<>();
            for (int i = arr.length-1; i >=0 ; i--) {
                if (set.contains(arr[i]))
                    min=i;
                else set.add(arr[i]);
            }
            if (min!=-1){
                System.out.println("The repeating elem is: "+ arr[min]);
            }
            else System.out.println("No repeating elem");
        }
        public static void main(String[] args) {
            int arr[] = {10, 5, 3, 4, 3, 5, 6};
            repeatingElem(arr);
        }

        public static class CheckIfNAndItsDoubleExists {
        }
    }
}
