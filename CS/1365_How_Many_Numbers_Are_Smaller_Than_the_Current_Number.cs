public class Solution {
    public int[] SmallerNumbersThanCurrent(int[] nums) {
        int[] copy = new int[nums.Length];
        Array.Copy(nums, 0, copy, 0, nums.Length);
        Array.Sort(copy);
        Dictionary<int, int> dic = new Dictionary<int, int>();
        for(int i = 0; i < copy.Length; i++){
            if(!dic.ContainsKey(copy[i])){
                dic.Add(copy[i], i);
            }
        }
        
        int[] result = new int[nums.Length];
        for(int i = 0; i < nums.Length; i++){
            result[i] = dic[nums[i]];
        }
        return result;
        /*
        int[] result = new int[nums.Length];
        for(int i = 0; i < nums.Length; i++){
            for(int j = 0; j< nums.Length; j++){
                if(nums[j] < nums[i]){
                    result[i]++;
                }
            }
        }
        return result;
        */
    }
}
