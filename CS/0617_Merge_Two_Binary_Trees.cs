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
    public TreeNode MergeTrees(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null){
            return null;
        }
        
        TreeNode result = new TreeNode();
        if(root1 != null){
            result.val += root1.val;
        }
        if(root2 != null){
            result.val += root2.val;
        }
        result.left = MergeTrees(root1?.left, root2?.left);
        result.right = MergeTrees(root1?.right, root2?.right);
        
        return result;
    }
}
