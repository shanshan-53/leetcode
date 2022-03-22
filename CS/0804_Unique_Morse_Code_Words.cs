public class Solution {
    public int UniqueMorseRepresentations(string[] words) {
        string[] t = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        //var set = new HashSet<string>();
        HashSet<string> set = new();
        foreach(string word in words){
            string temp = "";
            foreach(char c in word){
                temp += t[c - 'a'];
            }
            set.Add(temp);
        }
        
        return set.Count;
    }
}
