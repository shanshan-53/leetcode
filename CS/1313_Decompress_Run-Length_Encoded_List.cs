public class Solution {
    public int[] DecompressRLElist(int[] nums) {
        IList<int> result = new List<int>();
        for(int i = 0; i < nums.Length; i = i+2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j = 0; j < freq; j++){
                result.Add(val);
            }
        }
        return result.ToArray();
    }
}
