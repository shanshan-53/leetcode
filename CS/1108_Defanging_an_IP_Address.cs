public class Solution {
    public string DefangIPaddr(string address) {
        return address.Replace(".", "[.]");
        /*
        string result = "";
        for(int i = 0; i < address.Length; i++){
            if(address[i] == '.'){
                result += "[.]";
            }
            else{
                result += address[i];
            }
        }
        return result;
        */
    }
}
