class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int flag1 = 0;
        int flag2 = 0;
        for(int i  = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(flag1 == 0){
                    flag1++;
                }
                else{
                    flag2++;
                    result.append(s.charAt(i));
                }
            }
            else{
    1           if(flag2 > 0){
                    flag2--;
                    result.append(s.charAt(i));
                }
                else{
                    flag1--;
                }
            }
        }
        return result.toString();
    }
}
