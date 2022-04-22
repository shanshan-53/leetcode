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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        helper(root, 0);
        return result;
    }
    private void helper(TreeNode root, int level){
        if(root == null){
            return;
        }
        
        if(level > result.size()-1){
            List<Integer> item = new ArrayList<>();
            result.add(item);
        }
        if(level%2 == 0){
            result.get(level).add(root.val);
        }
        else{
            result.get(level).add(0, root.val);
        }
        
        helper(root.left, level+1);
        helper(root.right, level+1);
    }
}
