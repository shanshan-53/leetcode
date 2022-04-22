class Solution {
public:
    string toLowerCase(string s) {
        for(int i = 0; i < s.size(); i++){
            s[i] = (s[i] >= 'A' && s[i] <= 'Z') ? s[i] - 'A' + 'a' : s[i];
            //s[i] = tolower(s[i]);
            /*
            if(s[i] >= 'A' && s[i] <= 'Z'){
                s[i] = s[i] - 'A' + 'a';
            }
            */
        }
        return s;
    }
};
