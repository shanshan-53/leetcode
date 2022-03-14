class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int err = 0;
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                if(!allowed.contains(words[i].charAt(j) + "")){
                    err++;
                    break;
                }
            }
        }
        return words.length - err;
    }
}
