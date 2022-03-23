// 2022-03-06 12:34~12:37

public class Solution {
    public int[] CreateTargetArray(int[] nums, int[] index) {
        IList<int> result = new List<int>();
        for(int i = 0; i < nums.Length; i++){
            result.Insert(index[i], nums[i]);
        }
        return result.ToArray();
    }
}
