public class Solution {
    public int CountGoodTriplets(int[] arr, int a, int b, int c) {
        int result = 0;
        int n = arr.Length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(Math.Abs(arr[i] - arr[j]) <= a){
                    for(int k = j+1; k < n; k++){
                        if((Math.Abs(arr[j] - arr[k]) <= b) 
                             && (Math.Abs(arr[i] - arr[k]) <= c)){
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }
}
