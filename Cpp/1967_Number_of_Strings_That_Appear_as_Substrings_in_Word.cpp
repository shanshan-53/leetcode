class Solution {
public:
    int numOfStrings(vector<string>& patterns, string word) {
        int result = 0;
        for(int i = 0; i < patterns.size(); i++){
            if(word.find(patterns[i]) != -1){
            //if(word.find(patterns[i]) != string::npos){
                result++;
            }
        }
        return result;
    }
};
