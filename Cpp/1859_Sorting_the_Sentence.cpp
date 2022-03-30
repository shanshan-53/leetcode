class Solution {
public:
    string sortSentence(string s) {
        int temp = 0;
        vector<string> v;
        for(int i = 0; i < s.size(); i++){
            if(s[i] == ' '){
                v.push_back(s.substr(temp, i-temp));
                temp = i+1;
            }
        }
        v.push_back(s.substr(temp, s.size()-temp));
        
        vector<string> v2(v.size());
        for(int i = 0; i < v.size(); i++){
            int index = v[i][v[i].size()-1] - '0';
            v[i].pop_back();
            //string str = v[i].substr(0, v[i].size()-1);
            v2[index-1] = v[i];//str;
            //cout << index << endl;    
        }
        
        string result = v2[0];
        for(int i = 1; i < v2.size(); i++){
            
            result += (" " + v2[i]);
        }
        return result;
    }
};
