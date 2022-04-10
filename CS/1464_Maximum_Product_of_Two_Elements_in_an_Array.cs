public class Solution {
    public int MaxProduct(int[] nums) {
        int num1 = Int32.MinValue;
        int num2 = Int32.MinValue;
        for(int i = 0; i < nums.Length; i++){
            if(nums[i] >= num1){
                num2 = num1;
                num1 = nums[i];
            }
            else if(nums[i] > num2){
                num2 = nums[i];
            }
        }
        return (num1-1) * (num2-1);
    }
}
