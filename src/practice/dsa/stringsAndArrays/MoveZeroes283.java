package practice.dsa.stringsAndArrays;

public class MoveZeroes283 {
    public static void main(String[] args) {
        int[] nums = moveZeroes(new int[]{0,2,1,0,4,0,4});
        for (int num : nums)
            System.out.print(num + " ");
    }

    static int[] moveZeroes(int[] nums){
        int nonZeroIndex = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[nonZeroIndex];
                nums[nonZeroIndex]=temp;

                nonZeroIndex++;
            }
        }
        return nums;
    }
}
