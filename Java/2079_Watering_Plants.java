class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps = 1;
        int temp = capacity;
        
        temp -= plants[0];
        plants[0] = 0;

        for(int i = 0; i < plants.length-1; i++){
            
            if(plants[i+1] > temp){
                steps += 2*(i+1);
                temp = capacity;
            }
            
            steps++;
            temp -= plants[i+1];
            plants[i+1] = 0;
        }
        return steps;
    }
}
