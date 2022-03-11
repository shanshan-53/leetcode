public class Solution {
    public int CountPoints(string rings) {
        bool[,] f = new bool[10,3];
        int[] t = new int[10];
        for(int i = 0; i < rings.Length; i+=2){
            int color = 0;
            if(rings[i] == 'G'){
                color = 1;
            }
            else if(rings[i] == 'B'){
                color = 2;
            }
            
            int index = rings[i+1] - '0';
            if(f[index,color] == false){
                t[index]++;
                f[index,color] = true;
            }
        }
        
        int result = 0;
        for(int i = 0; i < 10; i++){
            if(t[i] == 3)
                result++;
        }
        return result;
    }
}
