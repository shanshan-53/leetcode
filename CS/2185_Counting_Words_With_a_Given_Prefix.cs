public class Solution {
    public int PrefixCount(string[] words, string pref) {
        return words.Where(x => x.StartsWith(pref)).Count();
        /*
        int result = 0;
        foreach(string word in words){
            result += word.StartsWith(pref) ? 1 : 0;
        }
        return result;
        */
    }
}
