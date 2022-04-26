class Solution {
public:
    vector<vector<int>> result;
    int target;
    
    vector<vector<int>> allPathsSourceTarget(vector<vector<int>>& graph) {
        target = graph.size()-1;
        vector<int> path; 
        path.push_back(0);
        
        helper(result, graph, path, 0);
        return result;
    }
private:
    void helper(vector<vector<int>>& graph, vector<int>& path, int curNode){
        if(curNode == target){
            result.push_back(path);
            return;
        }
        
        for(int i = 0; i < graph[curNode].size(); i++){
            path.push_back(graph[curNode][i]);
            helper(graph, path, graph[curNode][i]);
            path.pop_back();
        }
    }
};
