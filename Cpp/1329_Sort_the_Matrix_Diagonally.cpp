class Solution {
public:
    int m;
    int n;
    vector<vector<int>> diagonalSort(vector<vector<int>>& mat) {
        
        m = mat.size();
        n = mat[0].size();
        int i = m-2;
        int j = 0;
        
        while(i>=0){
            helper(mat, i, j);
            i--;
        }
        
        i = 0;
        j = 1;
        while(j<n){
            helper(mat, i, j);
            j++;
        }
        
        return mat;
    }
private:
    void helper(vector<vector<int>>& mat, int i , int j){
        vector<int> v;
        int vi = i;
        int vj = j;
        while(vi<m && vj<n){
            v.push_back(mat[vi][vj]);
            vi++;
            vj++;
        }
        sort(v.begin(), v.end());

        vi = i;
        vj = j;
        for(int item : v){
            mat[vi][vj] = item;
            vi++;
            vj++;
        }
    }
};
