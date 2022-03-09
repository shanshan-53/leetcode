class Solution {
    private List<List<Integer>> result = new ArrayList<>();
    private int[][] g;
    private int target;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        target = graph.length-1;
        g = graph;
        
        for(int i = 0; i < graph[0].length; i++){
            List<Integer> t = new ArrayList<>();
            t.add(0);
            helper(t, 0, i);
        }
        return result;
    }
    private void helper(List<Integer> t, int source, int index){
        source = g[source][index];
         if(source == target){
            t.add(source);
            result.add(t);
        }
        else{
            for(int i = 0; i < g[source].length; i++){
                List<Integer> next = new ArrayList<>();
                next.addAll(t);
                next.add(source);
                helper(next, source, i);
            }
        }
    }
}
