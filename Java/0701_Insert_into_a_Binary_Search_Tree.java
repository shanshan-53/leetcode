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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        TreeNode temp = root;
        TreeNode last = temp;
        while(temp != null){
            last = temp;
            if(temp.val < val){
                temp = temp.right;
            }
            else{
                temp = temp.left;
            }
        }
        if(last.val > val){
            last.left = new TreeNode(val);
        }
        else{
            last.right = new TreeNode(val);
        }
        
        return root;
    }
}
