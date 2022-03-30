class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        Map<Integer, String> map = new TreeMap<>();
        for(String word : words){
            int index = word.charAt(word.length()-1) - '0';
            map.put(index, word.substring(0, word.length()-1));
        }
        
        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            
            sb.append(value + " ");
        }
        return sb.deleteCharAt(sb.length()-1).toString();
    }
}
