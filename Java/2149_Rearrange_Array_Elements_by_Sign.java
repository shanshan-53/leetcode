class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                positive.add(nums[i]);
            }
            else{
                negative.add(nums[i]);
            }
        }
        for(int i = 0; i < positive.size(); i++){
            result[2*i] = positive.get(i);
            result[2*i + 1] = negative.get(i);
        }
        return result;
    }
}
