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
    List<Integer> result = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        if(root1 != null){
            addToList(root1);
        }
        if(root2 != null){
            addToList(root2);
        }
        
        Collections.sort(result);
        return result;
    }
    public void addToList(TreeNode root){
        if(root == null)
            return;
        
        result.add(root.val);
        addToList(root.left);
        addToList(root.right);
        
    }
    /*
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        if(root1 != null){
            result.add(root1.val);
            result.addAll(getAllElements(root1.left, root1.right));
        }
        if(root2 != null){
            result.add(root2.val);
            result.addAll(getAllElements(root2.left, root2.right));
        }
        
        Collections.sort(result);
        return result;
    }
    */
}
