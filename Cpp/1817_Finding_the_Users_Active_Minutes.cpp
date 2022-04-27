class Solution {
public:
    vector<int> findingUsersActiveMinutes(vector<vector<int>>& logs, int k) {
        vector<int> result(k);
        map<int, set<int>> m;
        for(int i = 0; i < logs.size(); i++){
            int id = logs[i][0];
            int time = logs[i][1];
            if(m.find(id) == m.end()){
                m[id] = set<int>();
            }
            m[id].insert(time);
        }
        
        for(map<int, set<int>>::iterator iter = m.begin(); iter!=m.end(); iter++){
            result[iter->second.size()-1]++;
        }
        
        return result;
    }
};
