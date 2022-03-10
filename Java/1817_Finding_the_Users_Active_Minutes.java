class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] result = new int[k];
        Map<Integer, HashSet<Integer>> m = new HashMap<>();
        for(int i = 0; i < logs.length; i++){
            int user = logs[i][0];
            int min = logs[i][1];
            if(m.get(user) == null){
                HashSet<Integer> set = new HashSet<>();
                set.add(min);
                m.put(user, set);
            }
            else{
                Set<Integer> set = m.get(user);
                set.add(min);
            }
        }
        //System.out.println(m);
        for(Map.Entry<Integer, HashSet<Integer>> e : m.entrySet()){
            result[e.getValue().size()-1]++;
        }
        return result;
    }
}
