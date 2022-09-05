package Hashing;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int arr[],int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int compliment = target - arr[i];
            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment),i};
            }
            map.put(arr[i],i);
        }
        return arr;
    }
    public static void main(String[] args) {
       int[] arr = {2,7,11,15};
       int target=9;
       for (int array:arr){
           System.out.print(array+" ");
       }
        System.out.println();
       int result[]=twoSum(arr,target);
       for(int a:result){
           System.out.print(a+" ");
        }

    }
}
