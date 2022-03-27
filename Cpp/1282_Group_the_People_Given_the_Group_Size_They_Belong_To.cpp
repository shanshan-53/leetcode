class Solution {
public:
    vector<vector<int>> groupThePeople(vector<int>& groupSizes) {
        vector<vector<int>> result;
        
        unordered_map<int, vector<int>> m;
        //map<int, vector<int>> m;
        for(int i = 0; i < groupSizes.size(); i++){
            /*
            if(m.count(groupSizes[i]) == 0){   
            //if(m.find(groupSizes[i]) == m.end()){
                m.insert(pair<int, vector<int>>(groupSizes[i], vector<int>() ));
            }
            */
            m[groupSizes[i]].push_back(i);
            
            if(m[groupSizes[i]].size() == groupSizes[i]){
                result.push_back(m[groupSizes[i]]);
                m[groupSizes[i]].clear();
                //m.erase(groupSizes[i]);
            }
        }
        
        return result;
    }
};
/*

for(map<int, vector<int>>::iterator iter = m.begin(); iter != m.end(); iter++)
{
    cout<<iter->first<<endl;
    cout<<iter->second.size()<<endl;
}	

*/
