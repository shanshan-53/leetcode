class Solution {
public:
    vector<string> cellsInRange(string s) {
        vector<string> result;
        
        char sc = s[0];
        char si = s[1];
        char ec = s[3];
        char ei = s[4];
        char temp = si;
        while(sc <= ec){
            while(si <= ei){
                string t = "";
                t.push_back(sc);
                t.push_back(si);
                result.push_back(t);
                si++;
            }
            sc++;
            si = temp;
        }
        
        return result;
    }
};
