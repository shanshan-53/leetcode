public class Solution {
    public string RestoreString(string s, int[] indices) {
        StringBuilder result = new StringBuilder(s);
        
        int tempI;
        char tempS;
        for(int i = 0; i < indices.Length; i++){
            while(indices[i] != i){
                tempI = indices[indices[i]];
                tempS = result[indices[i]];
                
                result[indices[i]] = result[i];
                indices[indices[i]] = indices[i];
                
                result[i] = tempS;
                indices[i] = tempI;
            }
        }
        
        return result.ToString();
    }
}
