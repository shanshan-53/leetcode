class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] result = new int[n];
        for(int i = 0; i < n; i++){
            if(boxes.charAt(i) == '1'){
                for(int j = 0; j < n; j++){
                    if(i != j){
                        result[j] += Math.abs(j-i);
                    }
                }
            }
        }
        return result;
        /*
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = 0; j < n; j++){
                if(i==j){
                    continue;
                }
                else{
                    if(boxes.charAt(j) == '1'){
                        sum += Math.abs(j-i);
                    }
                }
            }
            result[i] = sum;
        }
        return result;
        */
    }
}
