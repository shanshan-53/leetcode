class Solution {
    int[] t = new int[26];
    StringBuilder result = new StringBuilder();
    
    public String sortString(String s) {
        for(int i = 0; i < s.length(); i++){
            t[s.charAt(i)-'a']++;
        }
        
        while(result.length() < s.length()){
            helper(true);
            helper(false);
        }
        return result.toString();
    }
    private void helper(boolean flag){
        int start = flag ? 0: 25;
        int d = flag ? 1: -1;
        for(int i = start; i < 26 && i >= 0; i+=d){
            if(t[i] != 0){
                result.append((char)('a'+i));
                t[i]--;
            }
        }
    }
}
