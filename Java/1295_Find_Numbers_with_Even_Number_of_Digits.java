class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        
        for(int num : nums){
            if((num / 10 > 0 && num / 10 < 10) || (num / 1000 > 0 && num / 1000 < 10) || (num / 100000 > 0 && num / 100000 < 10))
            {
                result++;
            }
        }
        
        return result;
    }
}
