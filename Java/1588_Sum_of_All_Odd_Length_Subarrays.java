class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int result = 0;
        
        for(int i = 0; i < n ; i++){
            for(int j = 1; i+j-1 < n; j = j+2){
                for(int k = i; k-i+1 <= j && k < n; k++){
                    //System.out.println(k);
                    result += arr[k];
                }
            }
        }
        return result;
    }
}
