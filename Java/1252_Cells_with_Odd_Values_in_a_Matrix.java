class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int result = 0;
        int[] rArr = new int[m];
        int[] cArr = new int[n];
        
        for(int i = 0; i < indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];
            
            rArr[r]++;
            cArr[c]++;
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if((rArr[i] + cArr[j]) % 2 == 1){
                    result++;
                }
            }
        }
        return result;
        /*
        int result = 0;
        Map<Integer, Integer> rMap = new HashMap<>();
        Map<Integer, Integer> cMap = new HashMap<>();
        for(int i = 0; i < indices.length; i++){
            int r = indices[i][0];
            int c = indices[i][1];
            
            if(!rMap.containsKey(r)){
                rMap.put(r, 1);
            }
            else{
                rMap.put(r, rMap.get(r)+1);
            }
            
            if(!cMap.containsKey(c)){
                cMap.put(c, 1);
            }
            else{
                cMap.put(c, cMap.get(c)+1);
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int temp = 0;
                if(rMap.containsKey(i)){
                    temp += rMap.get(i);
                }
                if(cMap.containsKey(j)){
                    temp += cMap.get(j);
                }
                
                if(temp % 2 == 1){
                    result++;
                } 
            }
        }
        
        return result;
        */
    }
}
