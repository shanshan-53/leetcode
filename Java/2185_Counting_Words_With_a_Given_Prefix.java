class Solution {
    public int prefixCount(String[] words, String pref) {
        int result = 0;
        for(String word : words){
            if(word.startsWith(pref)){
                result++;
            }
            /*
            if(word.length() >= pref.length()){
                if(word.substring(0, pref.length()).equals(pref)){
                    result++;
                }
            }
            */
        }
        return result;
    }
}
