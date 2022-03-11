public class Solution {
    public int[] RunningSum(int[] nums) {
        int[] result = new int[nums.Length];
        int temp = 0;
        for(int i = 0; i < nums.Length; i++){
            temp += nums[i];
            result[i] = temp;
        }
        return result;
    }
}
