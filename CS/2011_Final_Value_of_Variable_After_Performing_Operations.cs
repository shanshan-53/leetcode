public class Solution {
    public int FinalValueAfterOperations(string[] operations) {
        int x = 0;
        for(int i = 0; i < operations.Length; i++){
            if(operations[i].Equals("++X") || operations[i].Equals("X++")){
                x++;
            }
            else{
                x--;
            }
        }
        return x;
    }
}


