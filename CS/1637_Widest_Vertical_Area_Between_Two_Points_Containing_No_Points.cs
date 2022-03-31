// 2022-03-07 14:58~15:09

public class Solution {
    public int MaxWidthOfVerticalArea(int[][] points) {
        List<int> x = new List<int>();
        for(int i = 0; i < points.Length; i++){
            x.Add(points[i][0]);
        }
        x.Sort();
        int result = 0;
        for(int i = 1; i < x.Count; i++){
            result = Math.Max(result, x[i] - x[i-1]);
        }
        return result;
    }
}
