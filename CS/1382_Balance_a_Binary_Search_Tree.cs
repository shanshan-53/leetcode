/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int val=0, TreeNode left=null, TreeNode right=null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Solution {
    List<int> list = new List<int>();
    TreeNode result = new TreeNode();
    public TreeNode BalanceBST(TreeNode root) {
        treeToList(root);
        
        result = build(0, list.Count-1);
        
        return result;
    }
    private TreeNode build(int l, int r){
        
        if(r-l+1 == 0){
            return null;
        }
        
        TreeNode root = new TreeNode();
        int n = l + (r-l+1)/2;
        root.val = list[n];
        
        root.left = build(l, n-1);
        root.right = build(n+1, r);
        
        return root;
    }
    private void treeToList(TreeNode root){
        if(root == null){
            return;
        }
        treeToList(root.left);
        list.Add(root.val);
        treeToList(root.right);
    }
}
