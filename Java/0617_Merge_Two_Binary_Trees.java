/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null){
            return root2;
        }
        else if(root2 == null){
            return root1;
        }
        root1.val += root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);
        
        return root1;
    }
    /*
    TreeNode result = new TreeNode();
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        result = helper(root1, root2);
        
        return result;
    }
    private TreeNode helper(TreeNode root1, TreeNode root2){
        if(root1 == null && root2 == null){
            return null;
        }
        TreeNode root = new TreeNode();
        
        if(root1 != null && root2 != null){
            root.val = root1.val + root2.val;
            root.left = helper(root1.left, root2.left);
            root.right = helper(root1.right, root2.right);
        }
        else{
            root = root1 == null ? root2 : root1;
        }
        return root;
    }
    */
}
