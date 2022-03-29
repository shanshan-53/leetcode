class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Map<String, Integer> map = new HashMap<>();
        map.put("type", 0);
        map.put("color", 1);
        map.put("name", 2);
        
        int key = map.get(ruleKey);
        
        int result = 0;
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).get(key).equals(ruleValue)){
                result++;
            }
        }
        
        return result;
    }
}
