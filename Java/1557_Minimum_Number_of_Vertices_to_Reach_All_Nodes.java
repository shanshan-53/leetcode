class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> result = new ArrayList<>();
        boolean[] t = new boolean[n];
        
        for(int i = 0; i < edges.size(); i++){
            t[edges.get(i).get(1)] = true;
        }
        
        for(int i = 0; i < n; i++){
            if(t[i] == false){
                result.add(i);
            }
        }
        return result;
    }
}
