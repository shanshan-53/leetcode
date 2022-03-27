class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> temp = new ArrayList<>();
        for(int i = 0; i < groupSizes.length; i++){
            while(temp.size() < groupSizes[i]){
                List<Integer> item = new ArrayList<>();
                temp.add(item);
            }
            
            List<Integer> item = temp.get(groupSizes[i]-1);
            
            item.add(i);
           
            if(item.size() == groupSizes[i]){
                result.add(new ArrayList(item));
                // result.add(item);
                item.clear();
            }
        }
        return result;
    }
}
