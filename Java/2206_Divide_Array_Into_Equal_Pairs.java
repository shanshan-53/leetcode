class Solution {
    public boolean divideArray(int[] nums) {
        boolean result = true;
        int[] t = new int[501];
        for(int num : nums){
            t[num]++;
        }
        for(int i = 1; i <= 500; i++){
            if(t[i] % 2 != 0){
                result = false;
            }
        }
        return result;
    }
}
