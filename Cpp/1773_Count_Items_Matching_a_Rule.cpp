class Solution {
public:
    int countMatches(vector<vector<string>>& items, string ruleKey, string ruleValue) {
        int result = 0;
        map<string, int> m;
        m["type"] = 0;
        m["color"] = 1;
        m["name"] = 2;
        int i = m[ruleKey];
        /*
        for(vector<string> item : items){
            if(item[i] == ruleValue){
                result++;
            }
        }
        */
        return count_if(items.begin(), 
                        items.end(), 
                        [i, ruleValue](auto item)
                        { return item[i] == ruleValue; });
        //return result;
    }
};
