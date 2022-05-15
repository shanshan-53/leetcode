/*
// Definition for a Node.
public class Node {
    public int val;
    public IList<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,IList<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

public class Solution {
    public IList<int> Preorder(Node root) {
        IList<int> result = new List<int>();
        if(root == null){
            return result;
        }
        Stack<Node> st = new Stack<Node>();
        st.Push(root);
        while(st.Count > 0){
            Node temp = st.Pop();
            result.Add(temp.val);
            for(int i = temp.children.Count-1; i >= 0; i--){
                st.Push(temp.children[i]);
            }
        }
        return result;
    }
}
