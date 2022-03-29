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
    //int max = 0;
    int temp = 0;
    public TreeNode BstToGst(TreeNode root) {
        if(root == null){
            return null;
        }
        
        //max = Math.Max(max, root.val);
        
        BstToGst(root.right);
        temp += root.val;
        root.val = temp;
        BstToGst(root.left);
        
        
        return root;
    }
}
