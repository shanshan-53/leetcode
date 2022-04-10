class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        int result = 0;
        int row1 = 0;
        int row2 = 0;
        for(int i = 0; i < bank.size(); i++){
            int c = count(bank[i]);
            if(c > 0){
                row1 = row2;
                row2 = c;
                result += row1 * row2;
            }
        }
        return result;
    }
private:
    int count(string str){
        int c = 0;
        for(int i = 0; i < str.size(); i++){
            if(str[i] == '1'){
                c++;
            }
        }
        return c;
    }
};
