public class Solution {
    public int MinAddToMakeValid(string s) {
        Stack<char> st = new Stack<char>();
        foreach(char c in s){
            if(c == '(' || st.Count == 0){
                st.Push(c);
            }
            else if(c == ')' && st.Peek() == '('){
                st.Pop();
            }
            else{
                st.Push(c);
            }
        }
        return st.Count;
    }
}
