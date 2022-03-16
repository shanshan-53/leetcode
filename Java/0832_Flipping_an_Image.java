class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] result = new int[n][n];
        
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= 0; j--){
                result[i][n-1-j] = image[i][j] == 0? 1: 0;
            }
        }
        return result;
    }
}
