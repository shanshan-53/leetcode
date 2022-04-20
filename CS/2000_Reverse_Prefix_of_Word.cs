public class Solution {
    public string ReversePrefix(string word, char ch) {
        StringBuilder result = new StringBuilder();
        int index = word.IndexOf(ch);
        for(int i = index; i >= 0; i--){
            result.Append(word[i]);
        }
        for(int i = index+1; i < word.Length; i++){
            result.Append(word[i]);
        }
        
        return result.ToString();
    }
}
