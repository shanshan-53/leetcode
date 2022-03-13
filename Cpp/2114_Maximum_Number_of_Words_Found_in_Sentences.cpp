class Solution {
public:
    int mostWordsFound(vector<string>& sentences) {
        int result = 0;
        for(int i = 0; i < sentences.size(); i++){
            int temp = 1;
            for(char c : sentences[i]){
                if(c == ' '){
                    temp++;
                }
            }
            result = max(result, temp);
        }
        return result;
    }
};
