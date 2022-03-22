public class Solution {
    public string FirstPalindrome(string[] words) {
        string result = "";
        foreach(string word in words){
            if(isPalindromic(word)){
                result = word;
                break;
            }
        }
        return result;
    }
    private bool isPalindromic(string str){
        bool flag = true;
        for(int i = 0; i <= str.Length/2; i++){
            if(str[i] != str[str.Length-1 - i]){
                flag = false;
            }
        }
        return flag;
    }
}
