class Solution {
public:
    int maxDepth(string s) {
        int result = 0;
        int temp = 0;
        for(char c : s){
            if(c == '('){
                temp++;
            }
            else if(c == ')'){
                temp--;
            }
            result = max(result, temp);
        }
        return result;
    }
};
