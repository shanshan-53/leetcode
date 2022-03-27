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
    public int SumEvenGrandparent(TreeNode root) {
        return helper(null, null, root);
    }
    private int helper(TreeNode grandparent, TreeNode parenet, TreeNode current){
        if(current != null){
            if(grandparent!=null){
                    return ((grandparent.val %2 == 0) ? current.val : 0) + helper(parenet, current, current.right) + helper(parenet, current, current.left);
            }
            else{
                return helper(parenet, current, current.right) + helper(parenet, current, current.left);
            }
        }
        else{
            return 0;
        }
    }
}
