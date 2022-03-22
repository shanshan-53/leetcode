public class Solution {
    public int CountPairs(int[] nums, int k) {
        int result = 0;
        
        var dic = new Dictionary<int, List<int>>();
        for(int i = 0; i < nums.Length; i++){
            if(!dic.ContainsKey(nums[i])){
                dic.Add(nums[i], new List<int>());
            }
            else{
                foreach(var x in dic[nums[i]]){
                    if(x*i%k == 0){
                        result++;
                    }
                }
            }
            dic[nums[i]].Add(i);
        }
        /*
        for(int i = 0; i < nums.Length; i++){
            for(int j = i+1; j < nums.Length; j++){
                if(nums[i] == nums[j] && i*j%k == 0){
                    result++;
                }
            }
        }
        */
        return result;
    }
}
