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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        int maxIndex = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        
        int[] leftArray = new int[maxIndex];
        System.arraycopy(nums, 0, leftArray, 0, maxIndex);
        
        int[] rightArray = new int[nums.length - maxIndex-1];
        System.arraycopy(nums, maxIndex+1, rightArray, 0, nums.length - maxIndex-1);
        
        TreeNode result = new TreeNode(nums[maxIndex], constructMaximumBinaryTree(leftArray), constructMaximumBinaryTree(rightArray));
        
        return result;
    }
}
