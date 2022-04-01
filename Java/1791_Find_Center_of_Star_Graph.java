class Solution {
    public int findCenter(int[][] edges) {
        int result = 0;
        int[] node = new int[edges.length+2];
        for(int i = 0; i < edges.length; i++){
            
            node[edges[i][0]]++;
            node[edges[i][1]]++;
            
            if(node[edges[i][0]] > 1){
                result = edges[i][0];
                break;
            }
            else if(node[edges[i][1]] > 1){
                result = edges[i][1];
                break;
            }
        }
        return result;
    }
}
