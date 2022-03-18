
public class Solution {
    public int[] CountPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.Length];
        for(int i = 0; i < queries.Length; i++){
            for(int j = 0; j < points.Length; j++){
                if(Math.Pow((points[j][0] - queries[i][0]), 2) + Math.Pow(points[j][1] - queries[i][1], 2) <= queries[i][2]*queries[i][2]){
                    result[i]++;
                }
            }
        }
        return result;
    }
}
