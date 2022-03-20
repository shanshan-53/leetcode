public class Solution {
    public string ReplaceDigits(string s) {
        StringBuilder result = new StringBuilder();
        char temp = '0';
        foreach(var c in s){
            if(c >= '0' && c <= '9'){
                result.Append((char)(temp + c -'0'));
            }
            else{
                temp = c;
                result.Append(c);
            }
        }
        
        return result.ToString();
    }
}
