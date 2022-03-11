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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0){
            return null;
        }
        
        TreeNode root = new TreeNode(preorder[0]);
        int countL = 0;
        for(int i = 1; i < preorder.length; i++){
            if(preorder[i] < root.val){
                countL++;
            }
            else{
                break;
            }
        }
        
        int[] left = new int[countL];
        int[] right = new int[preorder.length - 1 - countL];
        
        System.arraycopy(preorder, 1, left, 0, countL);
        System.arraycopy(preorder, countL + 1, right, 0, preorder.length - 1- countL);
        root.left = bstFromPreorder(left);
        root.right = bstFromPreorder(right);
        
        return root;
    }
}
