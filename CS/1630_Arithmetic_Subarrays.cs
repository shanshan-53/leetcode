public class Solution {
    public IList<bool> CheckArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        IList<bool> result = new List<bool>();
        for(int i = 0; i < l.Length; i++){
            bool f = true;
            int[] arr = new int[r[i] - l[i] + 1];
            for(int j = 0; j < arr.Length; j++){
                arr[j] = nums[l[i]+j];
            }
            Array.Sort(arr);
            for(int j = 1; j < arr.Length-1; j++){
                if(arr[j] - arr[j-1] != arr[j+1] - arr[j]){
                    f = false;
                    break;
                }
            }
            result.Add(f);
        }
        return result;
    }
}
