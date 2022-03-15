class Solution {
public:
    vector<int> shuffle(vector<int>& nums, int n) {
        vector<int> result(2*n);
        for(int i = 0; i < n; i++){
            result[2*i] = nums[i];
            result[2*i+1] = nums[n+i];
        }
        return result;
        /*
        vector<int> result;
        for(int i = 0; i < n; i++){
            result.push_back(nums[i]);
            result.push_back(nums[n+i]);
        }
        return result;
        */
    }
};
