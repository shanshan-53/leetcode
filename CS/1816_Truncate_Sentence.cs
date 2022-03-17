public class Solution {
    public string TruncateSentence(string s, int k) {
        StringBuilder result = new StringBuilder();
        int t = 0;
        foreach(var c in s){
            if(c == ' '){
                t++;
                if(t == k){
                    break;
                }
            }
            result.Append(c);
            
        }
        return result.ToString();
    }
}
