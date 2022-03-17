class Solution {
    public int largestAltitude(int[] gain) {
        int alt = 0;
        int result = 0;
        for(int x : gain){
            alt += x;
            result = Math.max(result, alt);
        }
        return result;
    }
}
