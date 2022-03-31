class Solution {
public:
    int maxWidthOfVerticalArea(vector<vector<int>>& points) {
        vector<int> v;
        int result = 0;
        for(vector<int> point : points){
            v.push_back(point[0]);
        }
        sort(v.begin() ,v.end());
        //quicksort
        //quicksort(v, 0, v.size()-1);
        
        for(int i = 1; i < v.size(); i++){
            result = max(result, v[i] - v[i-1]);
        }
        
        return result;
    }
    /*
    void quicksort(vector<int> &v, int left, int right){
        if(left >= right){
            return;
        }
        
        int key = v[left];
        int i = left;
        int j = right;
        while(i != j){
            while(v[j] > key && i < j){
                j--;
            }
            while(v[i] <= key && i < j){
                i++;
            }
            if(j > i){
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
            }
        }
        v[left] = v[i];
        v[i] = key;
        quicksort(v, left, i-1);
        quicksort(v, i+1, right);
    }
    */
};
