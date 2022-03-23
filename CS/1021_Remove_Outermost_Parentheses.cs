public class Solution {
    public string RemoveOuterParentheses(string s) {
        StringBuilder result = new StringBuilder();
        int level = 0;
        foreach(char c in s){
            if(c == '('){
                level++;
                if(level > 1){
                    result.Append(c);
                }
            }
            else{
                level--;
                if(level > 0){
                    result.Append(c);
                }
            }
        }
        return result.ToString();
    }
}
