public class Solution {
    public int CountKDifference(int[] nums, int k) {
        int result = 0;
        for(int i = 0; i < nums.Length; i++){
            for(int j = i+1; j < nums.Length; j++){
                if(Math.Abs(nums[j] - nums[i]) == k){
                    result++;
                }
            }
        }
        return result;
    }
}
