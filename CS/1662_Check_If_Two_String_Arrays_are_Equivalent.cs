public class Solution {
    public bool ArrayStringsAreEqual(string[] word1, string[] word2) {
        return String.Join("", word1) == String.Join("", word2);
        /*
        string w1 = "";
        for(int i = 0; i < word1.Length; i++){
            w1 += word1[i];
        }
        string w2 = "";
        for(int i = 0; i < word2.Length; i++){
            w2 += word2[i];
        }
        return w1 == w2;
        */
    }
}
