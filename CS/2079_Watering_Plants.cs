public class Solution {
    public int WateringPlants(int[] plants, int capacity) {
        int result = 0;
        int c = capacity;
        
        for(int i = 0; i < plants.Length; i++){
            
            result++;
            c -= plants[i];
            plants[i] = 0;
            
            if(i != plants.Length -1){
                if(c < plants[i+1]){
                    result += i+2;
                    c = capacity;
                    i = 0;
                }
            }
        }
        return result;
    }
}
