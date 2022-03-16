public class Solution {
    public bool CheckIfPangram(string sentence) {
        var t = new HashSet<char>(sentence);
        /*
        var t = new HashSet<char>();
        foreach(char c in sentence){
            t.Add(c);
        }
        */
        return t.Count == 26;
    }
}
