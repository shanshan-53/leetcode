public class Solution {
    IList<IList<int>> result = new List<IList<int>>();
    bool[] choosed;
    int target;
    int[][] g;
    public IList<IList<int>> AllPathsSourceTarget(int[][] graph) {
        int n = graph.Length;
        choosed = new bool[n];
        target = n-1;
        g = graph;
        
        IList<int> item = new List<int>();
        item.Add(0);
        choosed[0] = true;
        
        backtracking(item, 0);
        
        return result;
    }
    private void backtracking(IList<int> item, int current){
        
        if(current == target){
            result.Add(new List<int>(item));
            return;
        }
        
        int next;
        for(int i = 0; i < g[current].Length; i++){
            next = g[current][i];
            if(choosed[next] == false){
                item.Add(next);
                choosed[next] = true;

                backtracking(item, next);

                item.RemoveAt(item.Count-1);
                choosed[next] = false;
            }
        }
    }
}
/*
public class Solution {
    IList<IList<int>> result = new List<IList<int>>();
    int[][] g;
    int target;
    public IList<IList<int>> AllPathsSourceTarget(int[][] graph) {
        target = graph.Length-1;
        g = graph;
        
        for(int i = 0; i < graph[0].Length; i++){
            IList<int> item = new List<int>();
            item.Add(0);
            helper(item, 0, graph[0][i]);
        }
        
        return result;
    }
    private void helper(IList<int> item, int s, int t){
        item.Add(t);
        if(t == target){
            result.Add(item);
            return;
        }
        else{
            s = t;
            for(int i = 0; i < g[t].Length; i++){
                helper(new List<int>(item), s, g[s][i]);
            }
        }
    }
}
*/
