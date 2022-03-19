class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r = rowSum.length;
        int c = colSum.length;
        int[][] result = new int[r][c];
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                result[i][j] = (rowSum[i] >= colSum[j]) ? colSum[j] : rowSum[i];
                rowSum[i] -= result[i][j];
                colSum[j] -= result[i][j];
            }
        }
        
        return result;
    }
}
/*
0 7 10
3 6 8

   0 2 8
0  5 0 0
0  3 4 0
10 0 2 8
*/
