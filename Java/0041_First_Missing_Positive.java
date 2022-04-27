class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] t = new boolean[n];
        for(int num : nums){
            if(num <= 0 || num > n){
                continue;
            }
            else{
                t[num-1] = true;
            }
        }
        
        for(int i = 0; i < n; i++){
            if(t[i] == false){
                return i+1;
            }
        }
        return n+1;
    }
}
