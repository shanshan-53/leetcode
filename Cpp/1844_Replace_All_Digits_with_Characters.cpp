class Solution {
public:
    string replaceDigits(string s) {
        for(int i = 1; i < s.size(); i+=2){
            s[i] = s[i-1] + s[i] - '0';
        }
        return s;
        /*
        string result;
        char c;
        for(int i = 0; i < s.size(); i++){
            if(i%2 == 0){
                c = s[i];
            }
            else{
                c = (char) (c + s[i] - '0');
            }
            result += c;
        }
        return result;
        */
    }
};
