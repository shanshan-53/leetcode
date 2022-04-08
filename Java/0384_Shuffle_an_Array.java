class Solution {

    int[] nums;
    int[] original;
    public Solution(int[] nums) {
        this.original = nums;
        this.nums = Arrays.copyOf(nums, nums.length);
    }
    
    public int[] reset() {
        return this.original;
    }
    
    public int[] shuffle() {
        Random r = new Random();
        for(int i = 0; i < this.nums.length; i++){
            int randomIndex = r.nextInt(this.nums.length);
            swap(this.nums, i, randomIndex);
        }
        return this.nums;
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
