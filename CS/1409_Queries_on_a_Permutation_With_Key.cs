public class Solution {
    public int[] ProcessQueries(int[] queries, int m) {
        List<int> P = new List<int>();
        int[] result = new int[queries.Length];
        for(int i = 1; i <= m; i++){
            P.Add(i);
        }
        for(int i = 0; i < queries.Length; i++){
            result[i] = P.IndexOf(queries[i]);
            P.RemoveAt(result[i]);
            //P.Remove(queries[i]);
            P.Insert(0, queries[i]);
        }
        return result;
    }
}
