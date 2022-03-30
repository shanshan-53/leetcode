class Solution {
    public int minAddToMakeValid(String s) {
        int result = 0;
        Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                st.push(c);
            }
            else if(c == ')'){
                if(!st.isEmpty() && st.peek() == '('){
                    st.pop();
                }
                else{
                    st.push(c);
                }
            }
        }
        
        return st.size();
    }
}
