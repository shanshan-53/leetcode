class Solution {
public:
    string interpret(string command) {
        string result = "";
        for(int i = 0; i < command.size(); i++){
            if(command[i] == '('){
                if(command[i+1] == ')'){
                    result += "o";
                    i++;
                }
                else{
                    result += "al";
                    i += 3;
                }
            }
            else{
                result += command[i];
            }
            
        }
        return result;
    }
};
