public class Solution {
    public int MinPairSum(int[] nums) {
        int result = Int32.MinValue;
        int n = nums.Length;
        
        Array.Sort(nums);
        for(int i = 0; i < n; i++){
            result = Math.Max(result, nums[i] + nums[n-1-i]);
        }
        
        /*
        int[] sortedArray = insertionSort(nums);
        for(int i = 0; i < n; i++){
            result = Math.Max(result, sortedArray[i] + sortedArray[n-1-i]);
        }
        */
        return result;
    }
    /*
    private int[] insertionSort(int[] nums){
        
        for(int i = 1; i < nums.Length; i++){
            int j = i-1;
            int key = nums[i];
            while(j >= 0 && key < nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        return nums;
    }
    */
}
