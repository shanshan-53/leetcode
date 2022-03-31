class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int temp = 0;
        for(Map.Entry entry : map.entrySet()){
            int v = (int) entry.getValue();
            if(temp == 0){
                temp = v;
            }
            else if(temp != v){
                return false;
            }
        }
        return true;
        /*
        int[] t = new int[26];
        for(int i = 0; i < s.length(); i++){
            t[s.charAt(i)-'a']++;
        }
        int temp = 0;
        for(int i = 0; i < 26; i++){
            if(t[i] != 0){
                if(temp == 0){
                    temp = t[i];
                }
                else if(temp != t[i]){
                    return false;
                }
            }
        }
        return true;
        */
    }
}
