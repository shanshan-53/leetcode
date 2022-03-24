class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index != -1){
            StringBuilder result = new StringBuilder(word.substring(0,index+1));
            result.reverse();
            result.append(word.substring(index+1, word.length()));
            return result.toString();
        }
        return word;
        
        /*
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        for(; i < word.length(); i++){
            result.insert(0, word.charAt(i));// = word.charAt(i) + result;
            if(word.charAt(i) == ch){
                break;
            }
        }
        if(i < word.length()){
            for(int j = i+1; j < word.length(); j++){
                result.append(word.charAt(j));// += word.charAt(j);
            }
        }
        else{
            result = new StringBuilder(word);
        }
        
        return result.toString();
        */
    }
}
