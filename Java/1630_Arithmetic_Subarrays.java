class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> result = new ArrayList<>();
        int m = l.length;
        
        for(int i = 0; i < m; i++){
            int[] temp = new int[r[i] - l[i]+1];
            for(int j = 0; j < temp.length; j++){
                temp[j] = nums[l[i]+j];
            }
            Arrays.sort(temp);
            int d = temp[1] - temp[0];
            boolean f = true;
            for(int k = 1; k < temp.length; k++){
                if(temp[k] - temp[k-1] != d){
                    f = false;
                    break;
                }
            }
            result.add(f);
        }
        
        return result;
    }
}
