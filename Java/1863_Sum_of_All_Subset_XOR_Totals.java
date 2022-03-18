class Solution {
    int result = 0;
    boolean[] choosed;
    int[] nums;
    public int subsetXORSum(int[] nums) {
        choosed = new boolean[nums.length];
        this.nums = nums;
        
        backtracking(0, 0);
        
        return result;
    }
    private void backtracking(int index, int total){
        result += total;
        
        for(int i = index; i < nums.length; i++){
            if(choosed[i] == false){
                choosed[i] = true;
                total ^= nums[i];

                //System.out.println(total);
                backtracking(i, total);

                choosed[i] = false;
                total ^= nums[i];
            }
        }
    }
}
