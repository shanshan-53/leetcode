class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        return getGDC(max, min);
        /*
        for(int i = min; i > 0; i--){
            if(max%i == 0 && min%i == 0){
                return i;
            }
        }
        return 1;
        */
    }
    private int getGDC(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return getGDC(b, a%b);
        }
    }
}
