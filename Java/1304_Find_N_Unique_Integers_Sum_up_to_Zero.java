class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int s = n/2 * (-1);
        for(int i = 0; i < n; i++){
            result[i] = s+i;
            result[i] += (result[i] >= 0) && (n%2 == 0) ? 1 : 0;
            /*
            result[i] = s+i;
            if(result[i] >=0){
                if(n%2==0){
                    result[i]++;
                }
            }
            */
        }
        return result;
    }
}
