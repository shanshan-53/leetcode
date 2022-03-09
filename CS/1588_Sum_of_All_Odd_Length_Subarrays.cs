public class Solution {
    public int SumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int n = arr.Length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n && i+j-1 < n; j = j+2){
                for(int k = i; k < j+i; k++){
                    result += arr[k];
                }
            }
        }
        return result;
        /*
        int result = 0;
        int n = arr.Length;
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n && i+j-1 < n; j = j+2){
                for(int k = 0; k < j; k++){
                    result += arr[i+k];
                }
            }
        }
        return result;
        */
    }
}
