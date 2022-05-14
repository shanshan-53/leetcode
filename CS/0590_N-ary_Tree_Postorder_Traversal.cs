/*
// Definition for a Node.
public class Node {
    public int val;
    public IList<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, IList<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

public class Solution {
    public IList<int> Postorder(Node root) {
        IList<int> result = new List<int>();
        
        if(root == null)
            return result;
        
        Stack<Node> st = new Stack<Node>();
        st.Push(root);
        while(st.Count!=0){
            Node temp = st.Peek();
            if(temp.children == null || temp.children.Count == 0){
                result.Add(temp.val);
                st.Pop();
            }
            else{
                for(int i = temp.children.Count - 1; i >= 0; i--){
                    st.Push(temp.children[i]);
                }
                temp.children = null;
            }
        }
        return result;
    }
}
/*
public class Solution {
    IList<int> result = new List<int>();
    public IList<int> Postorder(Node root) {
        if(root != null){
            for(int i = 0; i < root.children.Count; i++){
                Postorder(root.children[i]);
            }
            result.Add(root.val);
        }
        return result;
    }
}
*/
