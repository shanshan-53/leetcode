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
    public int sumEvenGrandparent(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.right == null && root.left == null){
            return ans(root, 0);
        }
        else if(root.right == null){
            return ans(root, 0) + sumEvenGrandparent(root.left);
        }
        else if(root.left == null){
            return ans(root, 0) + sumEvenGrandparent(root.right);
        }
        else{
            return ans(root, 0) + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
        }
        
    }
    public int ans(TreeNode root, int sum){
        if(root.val%2 == 0){
            return sum + getValue(root, 0, 0);
        }
        else{
            return 0;
        }
    }
    public int getValue(TreeNode root, int level, int subSum){
        if(level == 2){
            return root.val;
        }
        else{
            if(root == null){
                return subSum;
            }
            else if(root.left == null && root.right == null){
                return subSum;
            }
            else if(root.left == null){
                return getValue(root.right, level+1, subSum);
            }
            else if(root.right == null){
                return getValue(root.left, level+1, subSum);
            }
            else{
                return getValue(root.left, level+1, subSum) + getValue(root.right, level+1, subSum);
            }
        }
    }
}
