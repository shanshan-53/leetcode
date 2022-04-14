class Solution {
    public int minSteps(String s, String t) {
        int[] st = new int[26];
        int[] tt = new int[26];
        for(int i = 0; i < s.length(); i++){
            st[s.charAt(i) - 'a']++;
            tt[t.charAt(i) - 'a']++;
        }
        int result = 0;
        for(int i = 0; i < 26; i++){
            result += Math.abs(st[i] - tt[i]);
        }
        return result/2;
    }
}
