public class Solution {
    public IList<int> TargetIndices(int[] nums, int target) {
        IList<int> result = new List<int>();
        
        Array.Sort(nums);
        /*
        //Bubble sort - 2
        int temp;
        for(int i = 0; i < nums.Length; i++){
            for(int j = nums.Length-1; j >= i+1 ; j--){
                if(nums[j] < nums[j-1]){
                    temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
            if(nums[i] > target){
                break;
            }
        }
        /*
        //Bubble sort
        int temp;
        for(int i = 0; i < nums.Length; i++){
            for(int j = 0; j < nums.Length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        /*
        //Inseration sort
        for(int i = 1; i < nums.Length; i++){
            int key = nums[i];
            int j = i - 1;
            for(; j >= 0 && nums[j] > key; j--){
                nums[j+1] = nums[j];
            }
            nums[j+1] = key;
        }
        */
        for(int i = 0; i < nums.Length; i++){
            //Console.WriteLine(nums[i]);
            if(nums[i] == target){
                result.Add(i);
            }
            else if(nums[i] > target){
                break;
            }
        }
        
        return result;
    }
}
