public class Solution {
    public int[] SumZero(int n) {
        int[] result = new int[n];
        
        for(int i = 0, v = n/2; i < n; i++, v--){
            if(v==0 && n%2==0)
                v--;
            result[i] = v;
        }
        
        return result;
    }
}
