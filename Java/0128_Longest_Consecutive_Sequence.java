class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        for(int num : nums){
            s.add(num);
        }
        
        int result = 0;
        for(int num : s){
            if(!s.contains(num-1)){
                int temp = 1;
                for(int i = num+1; s.contains(i); i++){
                    temp++; 
                }
                result = Math.max(result, temp);
            }
        }
        return result;
    }
}
/*
class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i = 0; i < nums.length; i++){
            ts.add(nums[i]);
        }
        int n1 = -2;
        int n2 = -2;
        int temp = 0;
        int result = 0;
        
        for(var val : ts){
            n2 = n1;
            n1 = val;
            if(n1 == n2+1){
                temp++;
            }
            else{
                result = Math.max(result,temp);
                temp = 1;
            }
        }
        result = Math.max(result,temp);
        return result;
    }
}
*/
