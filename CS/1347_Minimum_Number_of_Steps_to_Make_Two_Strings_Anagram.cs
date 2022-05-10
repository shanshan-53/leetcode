public class Solution {
    public int MinSteps(string s, string t) {
        int[] p = new int[26];
        int result = 0;
        for(int i = 0; i < s.Length; i++){
            p[s[i] - 'a']++;
            p[t[i] - 'a']--;
        }
        return p.Where(x => x > 0).Sum();
        /*
        for(int i = 0; i < 26; i++){
            if(p[i] > 0)
                result += p[i];
        }
        return result;
        */
    }
}
