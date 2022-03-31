public class Solution {
    int result = 0;
    int[] nums;
    public int SubsetXORSum(int[] nums) {
        this.nums = nums;
        for(int i = 0; i < nums.Length; i++){
            for(int c = 1; i+c <= nums.Length; c++){
                helper(c, 1, 0^nums[i], i);
            }
        }
        return result;
    }
    private void helper(int count, int curCount, int res, int index){
        if(count == curCount){
            result += res;
            return;
        }
        for(int i = index+1; i < nums.Length; i++){
            helper(count, curCount+1, res^nums[i], i);
        }
    }
}
