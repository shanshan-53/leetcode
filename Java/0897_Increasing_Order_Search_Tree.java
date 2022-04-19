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
    TreeNode result = new TreeNode();
    TreeNode temp = result;
    public TreeNode increasingBST(TreeNode root) {
        helper(root);
        return result.right;
    }
    private void helper(TreeNode root){
        if(root != null){
            helper(root.left);
            
            //temp.val = root.val;
            TreeNode it = new TreeNode(root.val);
            temp.right = it;
            temp = temp.right;
            
            helper(root.right);
        }
    }
}
/*
class Solution {
    TreeNode result = new TreeNode();
    List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        addToList(root);
        //Collections.sort(list);
        TreeNode temp = result;
        for(int i = 0; i < list.size(); i++){
            TreeNode it = new TreeNode(list.get(i));
            temp.right = it;
            temp = temp.right;
        }
        return result.right;
    }
    private void addToList(TreeNode root){
        if(root != null){
            addToList(root.left);
            list.add(root.val);
            addToList(root.right);
        }
    }
}
*/
