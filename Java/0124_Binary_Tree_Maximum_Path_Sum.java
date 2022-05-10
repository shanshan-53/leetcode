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
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        if(root != null){
            int l = 0;
            int r = 0;
            if(root.left != null){
                maxPathSum(root.left);
                l = root.left.val > 0 ? root.left.val : 0;
            }
            if(root.right != null){
                maxPathSum(root.right);
                r = root.right.val > 0 ? root.right.val : 0;
            }
            result = Math.max(root.val + l + r, result);
            root.val += Math.max(l, r) < 0 ? 0 : Math.max(l, r);
        }
        return result;
    }
}
