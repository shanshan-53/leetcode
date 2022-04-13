public class Solution {
    public string ReverseWords(string s) {
        StringBuilder result = new StringBuilder();
        string[] sArr = s.Split(" ");
        for(int i = 0; i < sArr.Length; i++){
            for(int j = sArr[i].Length-1; j >= 0; j--){
                result.Append(sArr[i][j]);
            }
            result.Append( i != sArr.Length-1 ? " " : "");
        }
        
        return result.ToString();
    }
}
