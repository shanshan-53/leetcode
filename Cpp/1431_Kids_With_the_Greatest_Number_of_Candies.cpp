class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        vector<bool> result;
        int maxValue = 0;
        for(auto candy : candies){
            maxValue = max(maxValue, candy);
        }
        for(auto candy : candies){
            if(candy + extraCandies >= maxValue){
                result.push_back(true);
            }
            else{
                result.push_back(false);
            }
        }
        return result;
    }
};
