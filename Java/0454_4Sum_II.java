class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                int key = 0 - nums1[i] - nums2[j];
                /*
                if(!map.containsKey(key)){
                    map.put(key, 0);
                }
                map.put(key, map.get(key)+1);
                */
                map.put(key, map.getOrDefault(key, 0) + 1); 
            }
        }
        
        for(int i = 0; i < nums3.length; i++){
            for(int j = 0; j < nums4.length; j++){
                /*
                if(map.containsKey(nums3[i] + nums4[j])){
                    result += map.get(nums3[i] + nums4[j]);
                }
                */
                result += map.getOrDefault(nums3[i] + nums4[j], 0);
            }
        }
        return result;
    }
}
/*

class Solution {
    private int[] nums1, nums2, nums3, nums4;
    int result = 0;
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        this.nums3 = nums3; 
        this.nums4 = nums4;
        
        helper(1, 0);
        
        return result;
    }
    private void helper(int arrayNum, int sum){
        if(arrayNum > 4){
            if(sum == 0){
                result++;
            }
            return;
        }
        int[] nums = null;
        switch(arrayNum){
            case 1 :
                nums = nums1;
                break;
            case 2 : 
                nums = nums2;
                break;
            case 3 : 
                nums = nums3;
                break;
            case 4 : 
                nums = nums4;
                break;
        }
        for(int i = 0; i < nums.length; i++){
            helper(arrayNum + 1, sum + nums[i]);
        }
    }
}

*/
