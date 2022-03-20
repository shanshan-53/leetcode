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
    List<Integer> list = new ArrayList<>();
    int k;
    public int kthSmallest(TreeNode root, int k) {
        this.k = k;
        treeToList(root);
        
        //Collections.sort(list);
        return list.get(k-1);
    }
    private void treeToList(TreeNode root){
        if(root == null || list.size() == k){
            return;
        }
        treeToList(root.left);
        list.add(root.val);
        treeToList(root.right);
    }
}
