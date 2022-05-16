class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        for(string word : words){
            if(isPalindromic(word)){
                return word;
            }
        }
        return "";
    }
private:
    bool isPalindromic(string s){
        int n = s.size();
        for(int i = 0; i < n/2; i++){
            if(s[i] != s[n-1-i]){
                return false;
            }
        }
        return true;
    }
};
