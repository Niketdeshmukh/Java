package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoArray {
    public static int[] Intersection(int[] nums1,int[] nums2){
        HashSet<Integer> set=new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        HashSet<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i]))
                set1.add(nums2[i]);
        }
        int result[] =new int[set1.size()];
        int i=0;
        for (Integer j:set1){
            result[i++]=j;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        for (int x:nums1){
            System.out.print(x);
        }
        System.out.println();
        int[] nums2={2,2};
        for (int y:nums2){
            System.out.print(y);
        }
        System.out.println();
        int[] result= Intersection(nums1,nums2);
        for (int a:result){
            System.out.print(a);
        }

    }
}
