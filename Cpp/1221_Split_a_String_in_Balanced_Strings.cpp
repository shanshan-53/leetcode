class Solution {
public:
    int balancedStringSplit(string s) {
        int result = 0;
        int f = 0; //s[0] == 'R'? 1 : -1;
        for(int i = 0; i < s.size(); i++){
            f += s[i] == 'R'? 1:-1;
            if(f == 0){
                result++;
            }
        }
        return result;
    }
};
