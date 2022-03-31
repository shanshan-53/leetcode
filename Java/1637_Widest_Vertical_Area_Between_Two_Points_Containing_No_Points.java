// 2022-02-25 18:15~18:29

class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Set<Integer> treeSet = new TreeSet<>();
        
        for(int i = 0; i < points.length; i++){
            treeSet.add(points[i][0]);
        }
        
        Iterator<Integer> itr = treeSet.iterator();
        int result = 0;
        int x1 = itr.next();
        int x2 = x1;
        while (itr.hasNext()) {
            x2 = itr.next();
            
            result = Math.max(result, x2-x1);
            
            x1 = x2;
        }
        return result;
    }
}
