public class Solution {
    public int MaxDepth(string s) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < s.Length; i++){
            if(s[i] == '('){
                temp++;
            }
            else if(s[i] == ')'){
                temp--;
            }
            result = Math.Max(result, temp);
        }
        return result;
    }
}
