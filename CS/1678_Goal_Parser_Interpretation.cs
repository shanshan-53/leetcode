public class Solution {
    public string Interpret(string command) {
        string result = "";
        for(int i = 0; i < command.Length; i++){
            if(command[i] == 'G'){
                result += "G";
            }
            else if(command[i] == '('){
                if(command[i+1] == ')'){
                    result += "o";
                }
                else{
                    result += "al";
                }
            }
        }
        return result;
    }
}
