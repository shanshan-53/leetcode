
class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            int total = 0;
            for(int j = 0; j < points.length; j++){
                int x = points[j][0] - queries[i][0];
                int y = points[j][1] - queries[i][1];
                int r = queries[i][2];
                double d = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
                if(d <= r){
                    total++;
                }
            }
            result[i] = total;
        }
        return result;
    }
}
