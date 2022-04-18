class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> result(nums.size());
        int l = 0;
        int e = 0;
        //int m = 0;
        for(int num : nums){
            if(num < pivot){
                l++;
            }
            else if(num == pivot){
                e++;
            }
            //else{
            //    m++;
            //}
        }
        int indexL = 0;
        int indexE = l;
        int indexM = l+e;
        for(int num : nums){
            if(num < pivot){
                result[indexL++] = num;
                //indexL++;
            }
            else if(num == pivot){
                result[indexE++] = num;
                //indexE++;
            }
            else{
                result[indexM++] = num;
                //indexM++;
            }
        }
        
        return result;
    }
};
