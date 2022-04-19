class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int pos = 0;
        int neg = 1;
        vector<int> result(nums.size());
        for(int num : nums){
            if(num >= 0){
                result[pos] = num;
                pos += 2;
            }
            else{
                result[neg] = num;
                neg += 2;
            }
        }
        return result;
        /*
        vector<int> pos;
        vector<int> neg;
        for(int num : nums){
            if(num >= 0){
                pos.push_back(num);
            }
            else{
                neg.push_back(num);
            }
        }
        vector<int> result;
        for(int i = 0; i < pos.size(); i++){
            result.push_back(pos[i]);
            result.push_back(neg[i]);
        }
        return result;
        */
    }
};
