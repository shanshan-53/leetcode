public class Solution {
    public IList<int> FindSmallestSetOfVertices(int n, IList<IList<int>> edges) {
        IList<int> result = new List<int>();
        HashSet<int> s = new HashSet<int>();
        for(int i = 0; i < edges.Count; i++){
            s.Add(edges[i][1]);
        }
        for(int i = 0; i < edges.Count; i++){
            if(s.Add(edges[i][0])){
                result.Add(edges[i][0]);
            }
        }
        return result;
    }
}
