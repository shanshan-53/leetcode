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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int result = 0;
        
        if(root == null){
            return 0;
        }
        
        if(root.val >= low && root.val <= high){
            result += root.val;
        }
        
        
        return result + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
        /*
        if(root.right == null && root.left == null){
            return result;
        }
        else if(root.right == null){
            return result + rangeSumBST(root.left, low, high);
        }
        else if(root.left == null){
            return result + rangeSumBST(root.right, low, high);
        }
        else{
            return result + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
        }
        */
    }
}
