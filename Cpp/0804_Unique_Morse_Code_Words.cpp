class Solution {
public:
    int uniqueMorseRepresentations(vector<string>& words) {
        vector<string> t = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        int result = 0;
        set<string> s;
        for(string word : words){
            string temp = "";
            for(int i = 0; i < word.size(); i++){
                temp += t[word[i] - 'a'];
            }
            s.insert(temp);
        }
        return s.size();
    }
};
