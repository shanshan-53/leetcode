class Solution {
public:
    vector<int> minOperations(string boxes) {
        vector<int> result;
        vector<int> leftToRight;
        vector<int> rightToLeft;
        int n = boxes.length();
        
        int count = boxes[0] - '0';
        int move = 0;
        leftToRight.push_back(0);
        for(int i = 1; i < n; i++){
            move += count;
            leftToRight.push_back(move);
            if(boxes[i] == '1'){
                count++;
            }
        }
        
        count = boxes[n-1] - '0';
        move = 0;
        rightToLeft.push_back(0);
        for(int i = n-2; i >= 0; i--){
            move += count;
            rightToLeft.push_back(move);
            if(boxes[i] == '1'){
                count++;
            }
        }
        
        for(int i = 0; i < n; i++){
            result.push_back(leftToRight[i] + rightToLeft[n-1-i]);
        }
        
        return result;
    }
};
