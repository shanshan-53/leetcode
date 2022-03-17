class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i = 0; i < s.length(); i++){
            char c = sb.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c -= ('A' - 'a');
                sb.setCharAt(i, c);
            }
        }
        return sb.toString();
    }
}
