class Solution {
public:
    string removeOuterParentheses(string s) {
        string result = "";
        int t = 0;
        for(char c : s){
            if(c == '('){
                t++;
                if(t != 1){
                    result += c;
                }
            }
            else{
                t--;
                if(t != 0){
                    result += c;
                }
            }
        }
        return result;
    }
};
