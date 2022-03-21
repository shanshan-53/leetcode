class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int temp = 1;
        int zero = 0;
        for(int num : nums){
            if(num != 0)
                temp *= num;
            else
                zero++;
        }
        if(zero > 1){
            return result;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(zero > 0){
                if(nums[i] != 0){
                    result[i] = 0;
                }
                else{
                    result[i] = temp;
                }
            }
            else{
                result[i] = temp / nums[i];
            }
        }
        return result;
    }
}
