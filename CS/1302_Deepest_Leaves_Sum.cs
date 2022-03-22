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
    public int DeepestLeavesSum(TreeNode root) {
        int n = getN(root, 0);
        int sum = getSum(root, 1, n);
        return sum;
    }
    public int getSum(TreeNode root, int c, int n){
        if(root == null){
            return 0;
        }
        else if(c == n){
            return root.val;
        }
        else{
            return getSum(root.left, c+1, n) + getSum(root.right, c+1, n);
        }
    }
    public int getN(TreeNode root, int n){
        if(root == null){
            return n;
        }
        else{
            return Math.Max(getN(root.left, n+1), getN(root.right, n+1));
        }
    }
}
