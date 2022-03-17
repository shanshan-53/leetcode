class Solution {
public:
    int minimumSum(int num) {
        vector<int> v;
        while(num > 0){
            v.push_back(num%10);
            num /= 10;
        }
        sort(v.begin(), v.end());
        /*
        // bubble sort
        for(int i = 0; i < v.size(); i++){
            for(int j = 0; j < v.size()-1-i; j++){
                if(v[j] > v[j+1]){
                    int temp = v[j];
                    v[j] = v[j+1];
                    v[j+1] = temp;
                }
            }
        }
        */
        return (v[0] + v[1])*10 + (v[2]+v[3]);
    }
};
