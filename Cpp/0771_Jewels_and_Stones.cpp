class Solution {
public:
    int numJewelsInStones(string jewels, string stones) {
        int result = 0;
        for(auto c : stones){
            if(jewels.find(c) != string::npos){
                result++;
            }
        }
        return result;
    }
};
