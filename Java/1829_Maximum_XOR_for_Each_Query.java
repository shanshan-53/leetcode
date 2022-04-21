class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] result = new int[n];
        int m = (int)Math.pow(2, maximumBit) - 1;
        for(int i = 0; i < n; i++){
            if(i == 0){
                result[n-1-i] = nums[i] ^= m;
            }
            else{
                result[n-1-i] = nums[i] ^= nums[i-1];
            }
        }
        return result;
    }
}
