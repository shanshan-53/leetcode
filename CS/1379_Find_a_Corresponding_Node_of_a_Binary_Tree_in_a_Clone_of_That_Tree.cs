/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public TreeNode GetTargetCopy(TreeNode original, TreeNode cloned, TreeNode target) {
        //TreeNode result = new TreeNode();
        if(original == null){
            return null;
        }
        else if(original == target){
            return cloned;
        }
        
        TreeNode left = GetTargetCopy(original.left, cloned.left, target);
        TreeNode right = GetTargetCopy(original.right, cloned.right, target);
        return left == null? right: left;
    }
}
