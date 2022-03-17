class Solution {
    public int minPartitions(String n) {
        
        int result = '0';
        for(int i = 0; i < n.length(); i++){
            result = Math.max(result, n.charAt(i));
        }
        return Integer.parseInt(result-'0'+"");
        
        
        /*
        int result = Integer.MIN_VALUE;
        for(int i = 0; i < n.length(); i++){
            result = Math.max(result, Integer.parseInt(n.charAt(i)+""));
        }
        return result;
        */
    }
}
