public class Solution {
    public int MinTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        
        for(int i = 1; i < points.Length; i++){
            result += Math.Max(Math.Abs(points[i][0] - points[i-1][0]), Math.Abs(points[i][1] - points[i-1][1]));
        }
        
        return result;
    }
    /*
    public int MinTimeToVisitAllPoints(int[][] points) =>
        Enumerable.Range(1, points.Length - 1)
            .Select(i => Math.Max(Math.Abs(points[i][0] - points[i - 1][0]), Math.Abs(points[i][1] - points[i - 1][1])))
            .Sum();
}
    */
}
