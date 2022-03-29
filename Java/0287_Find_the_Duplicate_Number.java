class Solution {
    public int findDuplicate(int[] nums) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(!set.add(num)){
                result = num;
                break;
            }
        }
        return result;
    }
}
