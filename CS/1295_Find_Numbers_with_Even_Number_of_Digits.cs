public class Solution {
    public int FindNumbers(int[] nums) {
        int result = 0;
        foreach(int num in nums){
            if((num == 100000) || (num < 10000 && num >= 1000) || (num < 100 && num >= 10)) 
            {
                result++;
            }
        }
        return result;
    }
}
