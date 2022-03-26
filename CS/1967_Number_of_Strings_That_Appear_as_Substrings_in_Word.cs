public class Solution {
    public int NumOfStrings(string[] patterns, string word) {
        int result = 0;
        foreach(string pattern in patterns){
            if(word.Contains(pattern)){
                result++;
            }
        }
        return result;
    }
}
