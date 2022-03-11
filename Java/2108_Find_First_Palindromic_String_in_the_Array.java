class Solution {
    public String firstPalindrome(String[] words) {
        String result = "";
        
        for(int i = 0; i < words.length; i++){
            StringBuilder sb = new StringBuilder(words[i]);
            sb.reverse();
            if(words[i].equals(sb.toString())){
                return words[i];
            }
        }
        return result;
    }
}
