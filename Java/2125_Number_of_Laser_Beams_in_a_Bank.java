class Solution {
    public int numberOfBeams(String[] bank) {
        int result = 0;
        int firstCount = 0;
        int secondCount = 0;
        for(int i = 0; i < bank.length; i++){
            secondCount = firstCount;
            
            int count = 0;
            for(int j = 0; j < bank[i].length(); j++){
                count += (bank[i].charAt(j) - '0');
            }
            
            if(count > 0){
                firstCount = count; 
                result += firstCount * secondCount;
            }
        }
        return result;
    }
}
