class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n = grid.length;
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                x[i] = Math.max(x[i], grid[i][j]);
                y[j] = Math.max(y[j], grid[i][j]);
            }
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                result += Math.min(x[i], y[j]) - grid[i][j];
            }
        }
        return result;
    }
}
