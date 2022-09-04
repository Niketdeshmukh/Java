package Programs150;

import java.util.Collection;
import java.util.Scanner;

public class practise {

    public static void main(String[] args) {
        int nums[]={1,0,1,1,0,1,1,1,0};
     int count=0,max=0;
     for(int i=0;i<nums.length;i++)
     {
         if(nums[i]==1)
         {  count++;
             max=Math.max(max,count);
         }
         else {
             count=0;
         }
     }
        System.out.println(max);
    }
}
