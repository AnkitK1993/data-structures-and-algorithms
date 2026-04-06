package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        int[] nums = test(new int[]{100, 4, 0,200, 1,0, 3, 2});
        for (int i: nums)
            System.out.println(i);
    }

    static int[] test(int[] nums) {
       int nonZeroIndex=0;

       int right= nums.length-1;

      for(int left=0;left<=right;left++){
           if(nums[left]!=0){
               int temp = nums[left];
               nums[left]=nums[nonZeroIndex];
               nums[nonZeroIndex]=temp;
               nonZeroIndex++;

           }
       }
       return nums;
    }
}
