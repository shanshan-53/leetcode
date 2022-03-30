public class Solution {
    public int XorOperation(int n, int start) {
        int result = start;
        int temp = start+2;
        for(int i = 0; i < n-1; i++){
            result ^= temp;
            temp += 2;
        }
        return result;
    }
}
