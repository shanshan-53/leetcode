class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] t = 
        {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<String>();
        for(String word : words){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < word.length(); i++){
                //char c = word.charAt(i);
                sb.append(t[ word.charAt(i) - 'a']);
            }
            set.add(sb.toString());
            /*
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(c >= 'a' && c <= 'z'){
                    word = word.replace(c + "", t[c-'a']);
                }
            }
            set.add(word);
            */
        }
        //System.out.println(set);
        return set.size();
    }
}
