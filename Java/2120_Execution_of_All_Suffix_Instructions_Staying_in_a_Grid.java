class Solution {
    public int[] executeInstructions(int n, int[] startPos, String s) {
        int[] result = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++){
            int y = startPos[0];
            int x = startPos[1];
            for(int j = i; j < s.length(); j++){
                switch(s.charAt(j)){
                    case 'R':
                        x++;
                        break;
                    case 'L':
                        x--;
                        break;
                    case 'U':
                        y--;
                        break;
                    case 'D':
                        y++;
                        break;
                }
                if((x >= 0 && x < n) && (y >= 0 && y < n)){
                    result[i]++;
                }
                else{
                    break;
                }
            }
        }
        return result;
    }
}
