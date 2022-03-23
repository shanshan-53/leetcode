import java.math.BigInteger;

class Solution {
    public int uniquePaths(int m, int n) {
        BigInteger result = new BigInteger("1");
        //long result = 1;
        int max = Math.max(m-1,n-1); // 22 
        int min = Math.min(m-1,n-1); // 11
        
        // 23*...*33 / 11
        
        //(m+n-2) 取 m-1 = (m+n-2)! / (m-1)!(n-1)!
        for(int i = max+1; i <= max+min; i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        
        for(int i = 1; i <= min; i++){
            result = result.divide(new BigInteger(i + ""));
            //result /= i;
        }
        
        return result.intValue();
    }
}
/*
class Solution {
    int[][] grid;
    int[][] d = {{1,0},{0,1}};
    int[] start;
    int[] end;
    int result = 0;
    public int uniquePaths(int m, int n) {
        grid = new int[m][n];
        start = new int[] {0,0};
        end = new int[] {m-1,n-1};
        
        helper(start, m, n);
        
        return result;
    }
    private void helper(int[] current, int m, int n){
        if(current[0] == end[0] && current[1] == end[1]){
            result++;
        }
        int[] next;
        
        for(int i = 0; i < 2; i++){
            next = new int[2];
            next[0] = current[0] + d[i][0];
            next[1] = current[1] + d[i][1];
            
            if(next[0] < m && next[1] < n)
                helper(next, m, n);
        }
    }
}
*/
