class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        int result = words.size();
        for(string word : words){
            for(char c : word){
                if(allowed.find(c) == -1){
                    result--;
                    break;
                }
            }
        }
        return result;
    }
};
