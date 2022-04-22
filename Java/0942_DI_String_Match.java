class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int l = 0;
        int r = n;
        /*
        Stack<Integer> st = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<Integer>();
        
        for(int i = 0; i <= n; i++){
            st.push(i);
            q.offer(i);
        }
        */
        
        int[] result = new int[n+1];
        for(int i = 0; i < n; i++){
            result[i] = s.charAt(i) == 'D' ? r--: l++;
            //result[i] = s.charAt(i) == 'D' ? st.pop() : q.poll();
        }
        result[n] = l++;
        //result[n] = st.pop();
        return result;
    }
}
/*
0 1 2 3 4
4 3 2 1 0
0 4 1 3 
*/
