class Solution {
    int result = 0;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        boolean[] t = new boolean[wordList.size()];
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < wordList.size(); i++){
            if(wordList.get(i).equals(endWord)){
                set.add(i);
                t[i] = true;
                //wordList.remove(i);
                break;
            }
        }
        if(set.size() != 0){
            helper(beginWord, wordList, set, 1, t);
        }
        
        return result;
    }
    private void helper(String beginWord, List<String> wordList, HashSet<Integer> set, int path, boolean[] t){
        HashSet<Integer> nextSet = new HashSet<>();
        for(int k : set){
            if(diff(wordList.get(k), beginWord) == 1){
                result = path + 1;
                return;
            }
            else{
                for(int i = 0; i < wordList.size(); i++){
                    if(t[i] == false && diff(wordList.get(i), wordList.get(k)) == 1){
                        nextSet.add(i);
                        t[i] = true;
                        //wordList.remove(i);
                        //i -= 1;
                    }
                }
            }
        }
        if(nextSet.size() > 0) 
            helper(beginWord, wordList, nextSet, path+1, t);
    }
    private int diff(String s1, String s2){
        int d = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                d++;
            }
        }
        return d;
    }
}
/*
class Solution {
    int result = 0;
    boolean[] t;
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        t = new boolean[n];
        helper(beginWord, endWord, 1, wordList);
        
        return result;
    }
    
    private void helper(String beginWord, String endWord, int path, List<String> wordList){
        if(beginWord.equals(endWord)){
            result = result == 0 ? path : Math.min(result, path);
            return;
        }
        
        int d = diff(beginWord, endWord);
        for(int i = 0; i < wordList.size(); i++){
            if(t[i] == false && (diff(beginWord, wordList.get(i)) == 1)){
                t[i] = true;
                path++;
                helper(wordList.get(i), endWord, path, wordList);
                t[i] = false;
                path--;
            }
        }
        return;
    }
    private int diff(String s1, String s2){
        int d = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                d++;
            }
        }
        return d;
    }
}
*/
