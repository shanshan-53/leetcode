public class Solution {
    public int FindGCD(int[] nums) {
        int result = 1;
        int max = Int32.MinValue;
        int min = Int32.MaxValue;
        
        foreach(var num in nums){
            max = Math.Max(max, num);
            min = Math.Min(min, num);
        }
        
        for(int i = min; i>0; i--){
            if(max%i == 0 && min%i == 0){
                result = i;
                break;
            }
        }
        return result;;
    }
}
