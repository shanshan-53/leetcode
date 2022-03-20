class Solution {
    boolean[][] choosed;
    int m;
    int n;
    int[][] matrix;
    List<Integer> result = new ArrayList<>();
    int[][] RDLU = new int[][] {{0,1},{1,0},{0,-1},{-1,0}};
    public List<Integer> spiralOrder(int[][] matrix) {
        this.matrix = matrix;
        m = matrix.length;
        n = matrix[0].length;
        choosed = new boolean[m][n];
        int[] start = new int[] {0,0};
        
        helper(start,0);
        
        return result;
    }
    private void helper(int[] current, int d){
        choosed[current[0]][current[1]] = true;
        result.add(matrix[current[0]][current[1]]);
        int[] next = new int[2];
        int next_d;
        for(int i = 0; i < 4; i++){
            next_d = (i+d)%4;
            next[0] = current[0] + RDLU[next_d][0];
            next[1] = current[1] + RDLU[next_d][1];
            if(((next[0] >= 0) && (next[0] < m))
               && ((next[1] >= 0) && (next[1] < n))
               && (choosed[next[0]][next[1]] == false)){
                helper(next, next_d);
                break;
            }
            else{
                continue;
            }
        }
    }
}
/*
1   2  3  4
5   6  7  8
9  10 11 12
13 14 15 16
*/
