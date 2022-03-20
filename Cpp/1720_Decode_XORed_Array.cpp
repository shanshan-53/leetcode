class Solution {
public:
    vector<int> decode(vector<int>& encoded, int first) {
        vector<int> result;
        int temp = first;
        result.push_back(temp);
        for(int i = 0; i < encoded.size(); i++){
            temp ^= encoded[i];
            result.push_back(temp);
        }
        return result;
    }
};
