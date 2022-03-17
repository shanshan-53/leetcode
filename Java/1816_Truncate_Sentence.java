class Solution {
    public String truncateSentence(String s, int k) {
        String[] sArray = s.split(" ");
        String[] rArray = Arrays.copyOf(sArray, k);
        return String.join(" ", rArray);
    }
}
