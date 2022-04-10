public class Solution {
    public int NumberOfBeams(string[] bank) {
        int result = 0;
        int f1 = 0;
        int f2 = 0;
        for(int i = 0; i < bank.Length; i++){
            int temp = 0;
            for(int j = 0; j < bank[i].Length; j++){
                if(bank[i][j] == '1'){
                    temp++;
                }
            }
            if(temp!=0){
                f2 = f1;
                f1 = temp;
                result += f1*f2;
            }
        }
        return result;
    }
}
