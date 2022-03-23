class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String[] result = new String[words.length];
        for(int i = 0; i < words.length; i++){
            result[i] = reverse(words[i]);
        }
        return String.join(" ", result);
    }
    private String reverse(String s){
        char[] cArray = s.toCharArray();
        int n = cArray.length;;
        char temp;
        for(int i = 0; i < n/2; i++){
            temp = cArray[i];
            cArray[i] = cArray[n-1-i];
            cArray[n-1-i] = temp;
        }
        return new String(cArray);
        /*
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
        */
    }
}
