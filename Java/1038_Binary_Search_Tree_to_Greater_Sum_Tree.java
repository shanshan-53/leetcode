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
    int temp = 0;
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;
    }
    private void helper(TreeNode root){
        if(root == null){
            return;
        }
        helper(root.right);
        temp += root.val;
        root.val = temp;
        helper(root.left);
    }
}
/*

// 2022-02-25 17:03~17:20

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
/*
class Solution {
    public TreeNode bstToGst(TreeNode root) {
        int max = getMax(root);
        
        TreeNode result = root;
        changeValue(root, max);
        
        return result;
    }
    public void changeValue(TreeNode root, int max){
        if(root == null){
            return;
        }
        
        if(root.val < max){
            root.val = ((root.val+max) * (max - root.val+1) )/2;
        }
        
        changeValue(root.left, max);
        changeValue(root.right, max);
    }
    public int getMax(TreeNode root){
        if(root == null){
            return 0;
        }
        
        return Math.max(Math.max(root.val, getMax(root.left)), getMax(root.right));
    }
}

*/
