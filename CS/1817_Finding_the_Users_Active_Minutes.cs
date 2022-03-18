public class Solution {
    public int[] FindingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];
        var m = new Dictionary<int, HashSet<int>>();
        
        foreach(var log in logs){
            if(!m.ContainsKey(log[0])){
                m.Add(log[0],new HashSet<int>(0));
            }
            m[log[0]].Add(log[1]);
        }
        
        foreach(var item in m){
            result[item.Value.Count - 1]++;
        }
        
        return result;
    }
}
