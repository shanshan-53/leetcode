class Solution {
    public boolean canJump(int[] nums) {
        /*
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > max) return false;
            max = Math.max(max, i + nums[i]);
        }
        
        return true;
        */
        boolean result = true;
        int target = nums.length-1;
        int minStep = 0;
        while(nums[0] < target){
            int maxStep = nums[0];
            int temp = nums[0];
            for(int i = minStep+1; i <= maxStep; i++){
                temp = Math.max(temp, i+nums[i]);
                nums[i] = 0;
            }
            minStep = maxStep;
            if(nums[0] == temp){
                result = false;
                break;
            }
            nums[0] = temp;
        }
        return result;
    }
}
/*
min = 0
target = 4
max = 2
temp = 4
i = 1
2 3 1 1 4
4 0 0 1 4

3 2 1 0 4
3
3


*/
/*
class Solution {
    public boolean canJump(int[] nums) {
        boolean result = false;
        int target = nums.length-1;
        
        return helper(nums, 0, target);
    }
    private boolean helper(int[] nums, int current, int target){
        if(current == target){
            return true;
        }
        
        int step = nums[current];
        if(step >= target - current){
            return true;
        }
        boolean r = false;
        for(int i = step; i>0 && !r; i--){
            if(nums[current + i]+i > step)
                r = r || helper(nums, current+i, target);
        }
        return r;
    }
}
*/
