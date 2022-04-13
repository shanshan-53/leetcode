class Solution {
public:
    vector<int> processQueries(vector<int>& queries, int m) {
        vector<int> P;
        vector<int> result;
        for(int i = 1; i <= m; i++){
            P.push_back(i);
        }
        
        for(int i = 0; i < queries.size(); i++){
            //result.push_back(helper(P, queries[i]));
            auto it = find(P.begin(),P.end(),queries[i]);
            int ind = it-P.begin();
            //int num = *it;
            result.push_back(ind);
            P.erase(it);
            P.insert(P.begin(),queries[i]);
        }
        
        
        return result;
    }
    /*
private:
    int helper(vector<int>& P, int val){
        int r = -1;
        for(int i = 0; i < P.size(); i++){
            if(P[i] == val){
                r = i;
                for(int j = i; j > 0; j--){
                    P[j] = P[j-1]; 
                }
                P[0] = val;
                break;
            }
        }
        return r;
    }
    */
};
