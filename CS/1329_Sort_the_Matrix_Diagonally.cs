public class Solution {
    int[][] result;
    int m;
    int n;
    public int[][] DiagonalSort(int[][] mat) {
        m = mat.Length;
        n = mat[0].Length;
        
        result = mat;
        
        for(int i = 0; i < m; i++){
            sortFunc(i, 0);
        }
        for(int j = 1; j < n; j++){
            sortFunc(0, j);
        }
        
        return result;
    }
    private void sortFunc(int i, int j){
        int length = Math.Min(m-i, n-j);
        int[] temp = new int[length];
        int x, y, k;
        x = i;
        y = j;
        k = 0;
        while(x < m && y < n){
            temp[k] = result[x][y];
            x++;
            y++;
            k++;
        }
        Array.Sort(temp);
        
        x = i;
        y = j;
        k = 0;
        while(x < m && y < n){
            result[x][y] = temp[k];
            x++;
            y++;
            k++;
        }
    }
}
