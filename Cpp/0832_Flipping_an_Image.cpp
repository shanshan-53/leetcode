class Solution {
public:
    vector<vector<int>> flipAndInvertImage(vector<vector<int>>& image) {
        vector<vector<int>> result;
        for(int i = 0; i < image.size(); i++){
            vector<int> item;
            for(int j = image[i].size()-1; j >= 0; j--){
                item.push_back((image[i][j]+1) % 2);
            }
            result.push_back(item);
        }
        return result;
    }
};
