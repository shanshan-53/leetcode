class Solution {
public:
    vector<int> createTargetArray(vector<int>& nums, vector<int>& index) {
        vector<int> result(nums.size());
        for(int i = 0; i < nums.size(); i++){
            for(int j = i; j > index[i]; j--){
                result[j] = result[j-1];
            }
            result[index[i]] = nums[i];
        }
        return result;
    }
};
