class Solution {
public:
    vector<int> countPoints(vector<vector<int>>& points, vector<vector<int>>& queries) {
        vector<int> result;
        for(int i = 0; i < queries.size(); i++){
            int dr = queries[i][2] * queries[i][2];
            int temp = 0;
            for(int j = 0; j < points.size(); j++){
                int dx = queries[i][0] - points[j][0];
                int dy = queries[i][1] - points[j][1];
                int dxy = (dx * dx) + (dy * dy);
                    if(dxy <= dr){
                    temp++;
                }
            }
            result.push_back(temp);
        }
        /*
        for(auto query : queries){
            int dr = query[2] * query[2];
            int temp = 0;
            for(auto point : points){
                int dxy = (query[0] - point[0]) * (query[0] - point[0]) 
                            + (query[1] - point[1]) * (query[1] - point[1]);
                if(dxy <= dr){
                    temp++;
                }
            }
            result.push_back(temp);
        }
        */
        return result;
    }
};
