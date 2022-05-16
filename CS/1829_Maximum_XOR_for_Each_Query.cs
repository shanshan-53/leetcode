public class Solution {
    public int[] GetMaximumXor(int[] nums, int maximumBit) {
        int n = nums.Length;
        int[] result = new int[n];
        //int x = (int) Math.Pow(2, maximumBit) - 1;
        int x = (1 << maximumBit) - 1;
        int temp = x;
        for(int i = 0; i < n; i++){
            temp ^= nums[i];
            result[n-1-i] = temp;
        }
        return result;
    }
}
