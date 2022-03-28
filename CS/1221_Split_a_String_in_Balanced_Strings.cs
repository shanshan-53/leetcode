public class Solution {
    public int BalancedStringSplit(string s) {
        int result = 0;
        int f = 0;
        for(int i = 0; i < s.Length; i++){
            if(s[i] == 'R'){
                f++;
            }
            else{
                f--;
            }
            if(f == 0){
                result++;
            }
        }
        return result;
    }
}
