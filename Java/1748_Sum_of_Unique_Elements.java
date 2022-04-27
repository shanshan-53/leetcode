class Solution {
    public int sumOfUnique(int[] nums) {
        int[] t = new int[100];
        for(int num : nums){
            t[num-1]++;
        }
        int result = 0;
        for(int i = 0; i < 100; i++){
            if(t[i] == 1){
                result += i+1; 
            }
        }
        return result;
    }
}
