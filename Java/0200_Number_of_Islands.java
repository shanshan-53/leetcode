class Solution {
    int m, n;
    public int numIslands(char[][] grid) {
        int result = 0;
        m = grid.length;
        n = grid[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == '1'){
                    //show(grid);
                    result++;
                    helper(grid, i, j);
                }
            }
        }
        return result;
    }
    
    private void helper(char[][] grid, int i, int j){
        if(i >= 0 && j >= 0 && i < m && j < n && grid[i][j] == '1'){
            grid[i][j] = '0';
            helper(grid, i+1, j);
            helper(grid, i-1, j);
            helper(grid, i, j+1);
            helper(grid, i, j-1);
        }
        //show(grid);
        /*
        grid[i][j] = '0';
        if((i+1 < m) && (grid[i+1][j] == '1')){
            helper(grid, i+1, j);
        }
        if(i-1 >= 0){
            if(grid[i-1][j] == '1'){
                helper(grid, i-1, j);
            }
        }
        
        if(j+1 < n){
            if(grid[i][j+1] == '1'){
                helper(grid, i, j+1);
            }
        }
        if(j-1 >= 0){
            if(grid[i][j-1] == '1'){
                helper(grid, i, j-1);
            }
        }
        */
    }
    private void show(char[][] g){
        for(int i = 0; i < g.length; i++){
            for(int j = 0; j < g[0].length; j++){
                System.out.print(g[i][j]);
            }
            System.out.println();
        }
    }
}
