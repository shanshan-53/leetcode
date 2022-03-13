class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > pivot){
                greater.add(nums[i]);
            }
            else if(nums[i] < pivot){
                less.add(nums[i]);
            }
            else{
                equal.add(nums[i]);
            }
        }
        less.addAll(equal);
        less.addAll(greater);
        return less.stream().mapToInt(i->i).toArray();
    }
}
