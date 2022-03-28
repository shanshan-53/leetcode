class Solution {
    public int balancedStringSplit(String s) {
        int result = 0;
        int r = 0;
        int l = 0;
        for(int i = 0; i < s.length(); i++){
            
            switch(s.charAt(i)){
                case 'R':
                    r++;
                    break;
                case 'L':
                    l++;
                    break;
            }
            
            result += (r == l)? 1: 0;
            /*
            if(r == l){
                result++;
            }
            */
        }
        return result;
    }
}
