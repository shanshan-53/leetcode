class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        char c;
        int shift;
        for(int i = 0; i < s.length(); i+=2){
            c = s.charAt(i);
            sb.append(c);
            if(i != s.length()-1){
                //shift = s.charAt(i+1) - '0';
                shift = Character.getNumericValue(s.charAt(i+1));
                sb.append((char)(c+shift));
            }
        }
        return sb.toString();
    }
}
