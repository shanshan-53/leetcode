class Solution {
    public boolean checkIfPangram(String sentence) {
        // String to Character Array
        Character[] sChar = sentence.chars()        // IntStream
                .mapToObj(ch -> (char) ch)          // Stream<Character>
                .toArray(Character[]::new);
        //Array to Set
        Set<Character> targetSet = new HashSet<Character>(Arrays.asList(sChar));
        
        return targetSet.size() == 26;
        
        /*
        boolean[] b = new boolean[26];
        
        for(int i = 0; i < sentence.length(); i++){
            b[sentence.charAt(i) - 'a'] = true;
        }
        
        for(int i = 0; i < 26; i++){
            if(b[i] == false){
                return false;
            }
        }
        
        return true;
        */
    }
}
