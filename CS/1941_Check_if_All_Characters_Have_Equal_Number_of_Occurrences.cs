public class Solution {
    public bool AreOccurrencesEqual(string s) {
        int[] t = new int[26];
        foreach(char c in s){
            t[c-'a']++;
        }
        int temp = 0;
        for(int i = 0; i < 26; i++){
            if(t[i] != 0){
                if(temp != 0 && temp != t[i]){
                    return false;
                }
                temp = t[i];
            }
        }
        return true;
    }
}
