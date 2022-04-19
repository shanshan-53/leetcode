public class Solution {
    public bool HalvesAreAlike(string s) {
        int a = 0;
        int b = 0;
        //HashSet<char> se = new HashSet<char> {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        char[] se = new char[10]  {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for(int i = 0; i < s.Length/2; i++){
            a += se.Contains(s[i]) ? 1 : 0;
            /*
            if(se.Contains(s[i])){
                a++;
            }
            */
        }
        for(int i = s.Length/2; i < s.Length; i++){
            b += se.Contains(s[i]) ? 1 : 0;
            /*
            if(se.Contains(s[i])){
                b++;
            }
            */
        }
        return a == b;
    }
}
