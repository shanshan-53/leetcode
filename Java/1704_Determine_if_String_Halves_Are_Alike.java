class Solution {
    
    char[] t = {'a','e','i','o','u','A','E','I','O','U'};
    String s;
    public boolean halvesAreAlike(String s) {
        this.s = s;
        
        int a = getCount(0, s.length()/2);
        int b = getCount(s.length()/2, s.length());
        
        return a == b;
    }
    private int getCount(int start, int end){
        int count = 0;
        for(int i = start; i < end; i++){
            char temp = s.charAt(i);
            for(char c : t){
                if(temp == c){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
