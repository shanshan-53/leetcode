class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int end = Math.min(word1.length(), word2.length());
        StringBuilder result = new StringBuilder();
        
        for(;i < end; i++){
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }
        result.append(word1.substring(i, word1.length()));
        result.append(word2.substring(i, word2.length()));
        
        return result.toString();
    }
}
