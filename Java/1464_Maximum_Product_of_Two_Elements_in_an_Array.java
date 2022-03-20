class Solution {
    public int maxProduct(int[] nums) {
        int v1 = Integer.MIN_VALUE;
        int v2 = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > v1){
                v2 = v1;
                v1 = nums[i];
            }
            else if(nums[i] > v2){
                v2 = nums[i];
            }
        }
        return (v1-1)*(v2-1);
    }
}
