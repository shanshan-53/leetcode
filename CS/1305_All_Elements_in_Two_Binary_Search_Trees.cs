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
    public IList<int> GetAllElements(TreeNode root1, TreeNode root2) {
        List<int> result = new List<int>();
        
        helper(result, root1);
        helper(result, root2);
        
        result.Sort();
        return result;
    }
    private void helper(IList<int> list, TreeNode root){
        if(root == null){
            return;
        }
        list.Add(root.val);
        helper(list, root.left);
        helper(list, root.right);
    }
}
