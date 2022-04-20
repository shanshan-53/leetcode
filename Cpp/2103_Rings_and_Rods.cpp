class Solution {
public:
    int countPoints(string rings) {
        map<char, set<char>> map;
        for(int i = 0; i < rings.size(); i+=2){
            char color = rings[i];
            char index = rings[i+1];
   
            map[index].insert(color); 
        }
        int result = 0;
        for(char i = '0'; i <= '9'; i++){
            if(map[i].size() == 3){
                result++;
            }
        }
        
        return result;
    }
};
