class Solution {
    public String generateTheString(int n) {
        return n % 2 == 0 ? "a".repeat(n-1) + "b" : "a".repeat(n);
        /*
        StringBuilder result = new StringBuilder();
        if(n % 2 == 0){
            for(int i = 0; i < n-1; i++){
                result.append('a');
            }
            result.append('b');
        }
        else{
            for(int i = 0; i < n; i++){
                result.append('a');
            }
        }
        return result.toString();
        */
    }
}
