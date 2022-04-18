public class Solution {
    public int MinOperations(int[] nums) {
        int result = 0;
        for(int i = 1; i < nums.Length; i++){
            if(nums[i-1] >= nums[i]){
                /*
                int temp = nums[i];
                nums[i] = nums[i-1] + 1;
                result += nums[i] - temp;
                */
                result += nums[i-1] + 1 - nums[i];
                nums[i] = nums[i-1] + 1;
            }
        }
        return result;
    }
}
