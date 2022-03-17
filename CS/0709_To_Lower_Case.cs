public class Solution {
    public string ToLowerCase(string s) {
        StringBuilder result = new StringBuilder();
        foreach(var c in s){
            if(c >= 'A' && c <= 'Z'){
                result.Append((char) (c - 'A' + 'a'));
            }
            else{
                result.Append(c);
            }
        }
        return result.ToString();
    }
}
