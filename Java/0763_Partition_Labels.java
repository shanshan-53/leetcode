class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Set<Character>> r = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> m = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            m.put(s.charAt(i), i);
        }
        
        int start = 0;
        int end;
        
        while(start < s.length()){        //while(end != s.length()-1){
            
            end = m.get(s.charAt(start));
            /*
            if(start == end){
                result.add(end - start +1);
            }
            */
            
            for(int i = start; i < end; i++){
                if(m.get(s.charAt(i)) > end){
                    end = m.get(s.charAt(i));
                }
                /*
                else if(i == end-1){
                    result.add(end - start +1);
                }
                */
            }
            result.add(end - start +1);
            start = end + 1;
        }
        return result;
    }
}
