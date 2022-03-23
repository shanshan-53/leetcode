/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original == null){
            return null;
        }
        else if(original == target){
            return cloned;
        }
        else{
            final TreeNode ans = getTargetCopy(original.right, cloned.right, target);
            return ans == null ? getTargetCopy(original.left, cloned.left, target) : ans;
        }
    }
}
