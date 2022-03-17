class Solution {
    int[][] grid;
    boolean[][] choosed;
    int m;
    int n;
    int[][] step = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    int[] start = new int[2];
    int[] target = new int[2];
    int remain;
    int result = 0;
    public int uniquePathsIII(int[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        remain = m*n;
        choosed = new boolean[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 1){
                    start[0] = i;
                    start[1] = j;
                    choosed[i][j] = true;
                    remain--;
                }
                else if(grid[i][j] == -1){
                    choosed[i][j] = true;
                    remain--;
                }
                else if(grid[i][j] == 2){
                    target[0] = i;
                    target[1] = j;
                }
            }
        }
        
        backtracking(start);
        
        return result;
    }
    private void backtracking(int[] current){
        
        if((current[0] == target[0] && current[1] == target[1])
            && (remain == 0)){
            result++;
            return;
        }
        
        int[] next = new int[2];
        for(int k = 0; k < step.length; k++){
            next[0] = current[0] + step[k][0];
            next[1] = current[1] + step[k][1];
            
            if((next[0] >= 0 && next[0] < m) 
                 && (next[1] >= 0 && next[1] < n)){
                if(grid[next[0]][next[1]] != -1 
                    && choosed[next[0]][next[1]] == false){
                    choosed[next[0]][next[1]] = true;
                    remain--;
                    
                    backtracking(next);
                    
                    choosed[next[0]][next[1]] = false;
                    remain++;
                }
            }
            else if(k == 3){
                return;
            }
        }
    }
}
