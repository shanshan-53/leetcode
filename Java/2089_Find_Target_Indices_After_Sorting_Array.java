class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        int start = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target){
                start++;
            }
            else if(nums[i] == target){
                count++;
            }
        }
        
        for(int i = start; i < count+start; i++){
            result.add(i);
        }
        return result;
        
        /*
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                result.add(i);
            }
        }
        return result;
        */
    }
}
