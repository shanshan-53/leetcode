public class Solution {
    public int[] ExecuteInstructions(int n, int[] startPos, string s) {
        int[] result = new int[s.Length];
        //int x = startPos[0];
        //int y = startPos[1];
        
        for(int i = 0; i < s.Length; i++){
            result[i] = 0;
            //int temp = 0;
            int x = startPos[0];
            int y = startPos[1];
            for(int j = i; j < s.Length; j++){
                if(s[j] == 'R'){
                    y++;
                }
                else if(s[j] == 'L'){
                    y--;
                }
                else if(s[j] == 'U'){
                    x--;
                }
                else{
                    x++;
                }
                
                if(x < 0 || x > n-1 || y < 0 || y > n-1){
                    break;
                }
                result[i]++;
                //temp++;
            }
            //result[i] = temp;
            //x = startPos[0];
            //y = startPos[1];
        }
        
        return result;
    }
}
