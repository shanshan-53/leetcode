class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int temp = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                temp++;
                result = Math.max(result, temp);
            }
            if(s.charAt(i) == ')'){
                temp--;
            }
        }
        return result;
    }
}
