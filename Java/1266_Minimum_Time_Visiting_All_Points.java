class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int result = 0;
        int x = points[0][0];
        int y = points[0][1];
        
        for(int i = 1; i < points.length; i++){
            int tx = points[i][0];
            int ty = points[i][1];
            
            result += Math.max(Math.abs(x-tx), Math.abs(y-ty));
            x = tx;
            y = ty;
        }
        
        return result;
    }
}
