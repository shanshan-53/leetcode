public class Solution {
    int result = 0;
    int[] start = new int[2];
    int[] end = new int[2];
    int[][] grid;
    int total;
    int m;
    int n;
    int[,] direction = new int[4,2] {{1,0},{0,1},{-1,0},{0,-1}};
    public int UniquePathsIII(int[][] grid) {
        this.grid = grid;
        m = grid.Length;
        n = grid[0].Length;
        total = m*n;
        int t = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    start[0] = i;
                    start[1] = j;
                    t++;
                    grid[i][j] = -1;
                }
                else if(grid[i][j] == 2){
                    end[0] = i;
                    end[1] = j;
                }
                else if(grid[i][j] == -1){
                    t++;
                }
            }
        }
        
        backtracking(start, t);
        
        return result;
    }
    private void backtracking(int[] current, int t){
        if(t == total && current[0] == end[0] && current[1] == end[1]){
            result++;
            return;
        }
        
        int[] next = new int[2];
        for(int i = 0; i < 4; i++){
            next[0] = current[0] + direction[i,0];
            next[1] = current[1] + direction[i,1];
            if((next[0] >= 0 && next[0] < m) && (next[1] >= 0 && next[1] < n)){
                if(grid[next[0]][next[1]] != -1){
                    grid[next[0]][next[1]] = -1;
                    t++;
                    backtracking(next, t);
                    grid[next[0]][next[1]] = 0;
                    t--;
                }
            }
            
        }
    }
}
