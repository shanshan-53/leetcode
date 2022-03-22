class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        List<List<Integer>> temp = new ArrayList<>();
        int[][] s = new int[][] {{-1,-1},{-1,0},{-1,1},
                                 {0,-1},{0,1},
                                 {1,-1},{1,0},{1,1}};
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int count = 0;
                for(int[] k : s){
                    count += (i+k[0] >= 0) && (i+k[0] < m) &&
                                (j+k[1] >= 0) && (j+k[1] < n)
                                ? board[i+k[0]][j+k[1]] : 0;
                }
                //System.out.println("i = " + i + ", j = " + j + ", count = "+ count);
                List<Integer> cell = new ArrayList<>();
                if(board[i][j] == 1 && (count < 2 || count > 3)){
                    cell.add(i);
                    cell.add(j);
                    temp.add(cell);
                }
                else if(board[i][j] == 0 && count == 3){
                    cell.add(i);
                    cell.add(j);
                    temp.add(cell);
                }
                
            }
        }  
        for(int i = 0; i < temp.size(); i++){
            List<Integer> cell = temp.get(i);
            board[cell.get(0)][cell.get(1)] = (board[cell.get(0)][cell.get(1)]+1)%2;
        }
    }
}
/*
1 -> 0
n < 2(1)

1 -> 1
n = 2(1) or 3(1)

1 -> 0
n > 3(1)

0 -> 1
n = 3(1)
*/
