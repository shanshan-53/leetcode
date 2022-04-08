class Solution {
public:
    int sumOddLengthSubarrays(vector<int>& arr) {
        int result = 0;
        vector<int> prefix(arr.size()+1);
        for(int i = 0; i < arr.size(); i++){
            prefix[i+1] = prefix[i] + arr[i];
        }
        
        for(int i = 1; i < prefix.size(); i++){
            for(int j = i-1; j >= 0; j-=2){
                result += prefix[i] - prefix[j];
            }
        }
        
        /*
        for(int i = 0; i < arr.size(); i++){
            for(int count = 1; i+count <= arr.size(); count += 2){
                for(int j = i; j-i+1 <= count && j < arr.size(); j++){
                    result += arr[j];
                }
            }
        }
        */
        return result;
    }
};
/*

prefix
0 1 5 7 12 15
1
4 
2 7
5 11
3 10 15

*/
