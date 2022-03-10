public class Solution {
    public int NumberOfMatches(int n) {
        int result = 0;
        int tempM = 0;
        while(n!=1){
            tempM = n/2;
            n -= tempM;
            result += tempM;
        }
        return result;
    }
}
