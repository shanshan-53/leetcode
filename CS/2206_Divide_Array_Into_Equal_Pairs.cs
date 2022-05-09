public class Solution {
    public bool DivideArray(int[] nums) {
        bool[] arr = new bool[500];
        for(int i = 0; i < nums.Length; i++){
            arr[nums[i]-1] = !arr[nums[i]-1];
        }
        for(int i = 0; i < 500; i++){
            if(arr[i]){
                return false;
            }
        }
        return true;
    }
}
