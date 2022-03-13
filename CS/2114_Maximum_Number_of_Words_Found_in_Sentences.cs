public class Solution {
    public int MostWordsFound(string[] sentences) {
        int result = Int32.MinValue;
        
        for(int i = 0; i < sentences.Length; i++){
            int temp = 1;
            for(int j = 0; j < sentences[i].Length; j++){
                if(sentences[i][j] == ' '){
                    temp += 1;
                }
            }
            result = Math.Max(result, temp);
        }
        
        return result;
    }
}
