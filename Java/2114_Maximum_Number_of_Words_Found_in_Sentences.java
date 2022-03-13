class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < sentences.length; i++){
            String[] words = sentences[i].split(" ");
            result = Math.max(result, words.length);
        }
        return result;
    }
}
