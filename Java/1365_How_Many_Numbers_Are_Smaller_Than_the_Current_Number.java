class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < numsCopy.length; i++){
            if(map.get(numsCopy[i]) == null){
                map.put(numsCopy[i], i);
            }
        }
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = map.get(nums[i]);
        }
        return result;
        /*
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int total = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    total++;
                }
            }
            result[i] = total;
        }
        return result;
        */
    }
}
