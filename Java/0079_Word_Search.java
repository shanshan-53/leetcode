class Solution {
    public boolean exist(char[][] board, String word) {
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(backtracking(board, 0, word, i, j)){
                    return true;
                }
            }
        }
        
        return false;
    }
    private boolean backtracking(char[][] board, int index, String word, int x, int y){
        if(index == word.length()){
            return true;
        }
        
        if(x < 0 || x >= board.length
           || y < 0 || y >= board[0].length){
            return false;
        }
        if(word.charAt(index) != board[x][y]){
            return false;
        }
        
        board[x][y] = '0';
        if(backtracking(board, index+1, word, x, y+1)
           || backtracking(board, index+1, word, x, y-1)
           || backtracking(board, index+1, word, x+1, y)
           || backtracking(board, index+1, word, x-1, y)){
            return true;
        }
        board[x][y] = word.charAt(index);
        
        return false;
    }
}
/*
class Solution {
    boolean result = false;
    int[][] d = {{1,0}, {0,1}, {-1,0}, {0,-1}};
    public boolean exist(char[][] board, String word) {
        
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    board[i][j] = '0';
                    backtracking(board, 1, word, i, j);    
                    board[i][j] = word.charAt(0);
                }
            }
        }
        
        return result;
    }
    private void backtracking(char[][] board, int index, String word, int x, int y){
        if( index == word.length() ){
            result = true;
            return;
        }
        
        for(int i = 0; i < 4; i++){
            int nextX = x + d[i][0];
            int nextY = y + d[i][1];
            if(nextX >= 0 && nextX < board.length && nextY >= 0 && nextY < board[0].length){
                if(board[nextX][nextY] == word.charAt(index)){
                    board[nextX][nextY] = '0';
                    backtracking(board, index+1, word, nextX, nextY);
                    board[nextX][nextY] = word.charAt(index);
                }
            }
        }
    }
}
*/
