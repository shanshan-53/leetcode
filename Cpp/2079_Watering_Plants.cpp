class Solution {
public:
    int wateringPlants(vector<int>& plants, int capacity) {
        int step = 0;
        int water = capacity;
        int current = -1;
        int n = plants.size();
        
        while(current <= (n-1) && plants[n-1] != 0){
            if(plants[current+1] <= water){
                current++;
                step++;
                water -= plants[current];
                plants[current] = 0;
            }
            else{
                step += (current + 1);
                current = -1;
                water = capacity;
            }
        }
        return step;
    }
};
