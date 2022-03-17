public class Solution {
    public int MinPartitions(string n) {
        int result = 0;
        for(int i = 0; i < n.Length; i++){
            result = Math.Max(result, n[i]);
        }
        return result-'0';
    }
}
