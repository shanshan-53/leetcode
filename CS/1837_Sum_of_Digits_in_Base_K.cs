public class Solution {
    public int SumBase(int n, int k) {
        int result = 0;
        while(n > 0){
            result += n % k;
            n /= k;
        }
        return result;
    }
}
