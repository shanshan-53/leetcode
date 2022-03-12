// 2022-03-02 14:03~14:08

public class Solution {
    public int MaximumWealth(int[][] accounts) {
        int result = Int32.MinValue;
        for(int i = 0; i < accounts.Length; i++){
            int temp = 0;
            for(int j = 0; j < accounts[i].Length; j++){
                temp += accounts[i][j];
            }
            result = Math.Max(result, temp);
        }
        return result;
    }
}

// Int32.MinValue
// Math.Max(a, b);
