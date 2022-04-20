public class Solution {
    public string SortString(string s) {
        int[] t = new int[26];
        foreach(char c in s){
            t[c-'a']++;
        }
        StringBuilder result = new StringBuilder("");
        while(result.Length != s.Length){
            for(int i = 0; i < 26; i++){
                if(t[i] > 0){
                    result.Append((char)('a' + i));
                    t[i]--;
                }
            }
            for(int i = 25; i >= 0; i--){
                if(t[i] > 0){
                    result.Append((char)('a' + i));
                    t[i]--;
                }
            }
        }
        return result.ToString();
    }
}
