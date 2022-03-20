public class Solution {
    public int[] Decode(int[] encoded, int first) {
        int[] result = new int[encoded.Length+1];
        result[0] = first;
        for(int i = 1; i < result.Length; i++){
            result[i] = result[i-1]^encoded[i-1];
        }
        return result;
    }
}
