public class Solution {
    public int[][] FlipAndInvertImage(int[][] image) {
        int n = image.Length;
        int[][] result = new int[n][];
        
        for(int i = 0; i < n; i++){
            result[i] = new int[n];
            for(int j = 0; j < n; j++){
                result[i][n-1-j] = (image[i][j] + 1) % 2;
            }
        }
        return result;
    }
}
