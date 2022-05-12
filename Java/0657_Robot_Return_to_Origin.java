class Solution {
    public boolean judgeCircle(String moves) {
        int[] p = new int[2];
        //for(int i = 0; i < moves.length(); i++){
        for (char c : moves.toCharArray()){    
            switch(c){  //moves.charAt(i)){
                case 'U':
                    p[0]++;
                    break;
                case 'D':
                    p[0]--;
                    break;
                case 'R':
                    p[1]++;
                    break;
                case 'L':
                    p[1]--;
                    break;
            }
        }
        return p[0] == 0 && p[1] == 0;
    }
}
