class Solution {
    public int[] processQueries(int[] queries, int m) {
        List<Integer> P = new ArrayList<>();
        int[] result = new int[queries.length];
        for(int i = 0; i < m; i++){
            P.add(i+1);
        }
        for(int i = 0; i < queries.length; i++){
            int target = P.indexOf(queries[i]);
            result[i] = target;
            P.remove(target);
            P.add(0, queries[i]);
            /*
            for(int j = 0; j < m; j++){
                if(queries[i] == P.get(j)){
                    result[i] = j;
                    P.remove(j);
                    P.add(0, queries[i]);
                    //System.out.println(P);
                }
            }
            */
        }
        return result;
    }
}
