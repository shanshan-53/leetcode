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
class FindElements {
    TreeNode recover = new TreeNode();
    public FindElements(TreeNode root) {
        if(root != null){
            recover.val = 0;
            helper(root, recover);
        }
    }
    private void helper(TreeNode ori, TreeNode rec){
        if(ori != null){
            if(ori.left != null){
                rec.left = new TreeNode(2 * rec.val + 1);
                helper(ori.left, rec.left);
            }
            if(ori.right != null){
                rec.right = new TreeNode(2 * rec.val + 2);
                helper(ori.right, rec.right);
            }
        }
    }
    
    public boolean find(int target) {
        return helper(recover, target);
    }
    private boolean helper(TreeNode temp, int t){
        if(temp == null){
            return false;
        }
        //System.out.println(temp.val);
        if(temp.val == t){
            return true;
        }
        return helper(temp.left, t) || helper(temp.right, t);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */
