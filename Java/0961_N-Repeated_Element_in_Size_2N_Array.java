class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length / 2;
        int result = 0;
        int[] t = new int[10001];
        for(int num : nums){
            if(++t[num] > 1){
                result = num;
                break;
            }
        }
        return result;
    }
}
