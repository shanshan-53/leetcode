//https://leetcode.jp/leetcode-1314-matrix-block-sum-解题思路分析/
class Solution {
    int m;
    int n;
    public int[][] matrixBlockSum(int[][] mat, int k) {
        m = mat.length;
        n = mat[0].length;
        int[][] answer = new int[m][n];
        for(int r = 0; r < m; r++){
            for(int c = 0; c < n; c++){
                answer[r][c] = getSum(mat, r, c, k);
            }
        }
        return answer;
    }
    private int getSum(int[][] mat, int r, int c, int k){
        int a = 0;
        int rs = r-k < 0 ? 0 : r-k;
        int re = r+k >= m? m-1: r+k;
        int cs = c-k < 0 ? 0 : c-k;
        int ce = c+k >= n ? n-1 : c+k;
        for(int i = rs; i <= re; i++){
            for(int j = cs; j <= ce; j++){
                a += mat[i][j];
            }
        }
        return a;
    }
}
/*
1 2 3
4 5 6
7 8 9

12 21 16
27 45 33
24 39 28

 1  2  3  4  5
 6  7  8  9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

16  27  33  39  28
39  63  72  81  57
69 108 117 126  87
99 153 162 171 117
76 117 123 129  88

16  9 11 13 28
13  7  8  9 19
23 12 13 14 29
33 17 18 19 39
76 39 41 43 88


*/
