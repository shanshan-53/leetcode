public class Solution {
    public int MaxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        int n = grid.Length;
        int[] maxX = new int[n];
        int[] maxY = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                maxX[i] = Math.Max(maxX[i], grid[i][j]);
                maxY[j] = Math.Max(maxY[j], grid[i][j]);
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result += Math.Min(maxX[i], maxY[j]) - grid[i][j];
            }
        }
        return result;
    }
}
