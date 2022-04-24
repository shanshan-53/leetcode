class Solution {
public:
    string truncateSentence(string s, int k) {
        string result = "";
        int temp = 0;
        for(int i = 0; i < s.size() && temp<k; i++){
            if(s[i] == ' '){
                temp++;
                result += s[i];
            }
            else{
                result += s[i];
            }
        }
        if(temp == k)
            result.pop_back();
        return result;
        /*
        string res;
        int i = 0;
        int cnt = 0;
        while (i < s.size() && cnt < k) {
            if (s[i] == ' ') cnt++;
            i++;
        }
        cout << i << endl;
        return s.substr(0, (i==s.size() ? i : i-1)); 
        */
    }
};
