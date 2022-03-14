public class Solution {
    public int CountConsistentStrings(string allowed, string[] words) {
        int result = words.Length;
        foreach(string word in words){
            foreach(char c in word){
                if(!allowed.Contains(c)){
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}
