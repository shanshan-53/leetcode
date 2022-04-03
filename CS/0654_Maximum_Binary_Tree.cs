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
    public TreeNode ConstructMaximumBinaryTree(int[] nums) {
        
        if(nums.Length == 0){
            return null;
        }
        
        int targetIndex = 0;
        for(int i = 0; i < nums.Length; i++){
            if(nums[i] > nums[targetIndex]){
                targetIndex = i;
            }
        }
        int[] left = new int[targetIndex];
        int[] right = new int[nums.Length - targetIndex - 1];
        Array.Copy(nums, 0, left, 0, targetIndex);
        Array.Copy(nums, targetIndex+1, right, 0, nums.Length - targetIndex - 1);
        return new TreeNode(nums[targetIndex], ConstructMaximumBinaryTree(left), ConstructMaximumBinaryTree(right));
    }
}
