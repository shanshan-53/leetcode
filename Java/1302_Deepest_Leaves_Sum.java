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
    public int deepestLeavesSum(TreeNode root) {
        int maxDepth = getMaxDepth(root, 1);
        
        int sum = getNDepthSum(root, maxDepth, 1, 0);
        
        return sum;
    }
    public int getMaxDepth(TreeNode root, int depth){
        if(root.left == null && root.right == null){
            return depth;
        }
        else if(root.left == null){
            return getMaxDepth(root.right, depth+1);
        }
        else if(root.right == null){
            return getMaxDepth(root.left, depth+1);
        }
        else{
            return Math.max(getMaxDepth(root.left, depth+1), getMaxDepth(root.right, depth+1));
        }
    }
    public int getNDepthSum(TreeNode root, int n, int depth, int sum){
        if(n == depth){
            return sum + root.val;
        }
        else{
            if(root.left != null && root.right != null){
                return getNDepthSum(root.left, n, depth+1, sum) + getNDepthSum(root.right, n, depth+1, sum);
            }
            else if(root.left != null){
                return getNDepthSum(root.left, n, depth+1, sum);
            }
            else if(root.right != null){
                return getNDepthSum(root.right, n, depth+1, sum);
            }
            else{
                return 0;
            }
        }
    }
}
