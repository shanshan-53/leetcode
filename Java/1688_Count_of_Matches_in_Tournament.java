class Solution {
    public int numberOfMatches(int n) {
        int result = 0;
        while(n != 1){
            int m = n/2;
            n -= m;
            result = result + m;
        }
        return result;
    }
}
