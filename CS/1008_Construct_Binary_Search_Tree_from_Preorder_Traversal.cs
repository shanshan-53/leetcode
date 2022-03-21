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
    int[] arr;
    public TreeNode BstFromPreorder(int[] preorder) {
        arr = preorder;
        TreeNode root = new TreeNode();
        
        root = helper(0, preorder.Length);
        
        return root;
    }
    private TreeNode helper(int l, int r){
        if(r - l <= 0){
            return null;
        }
        TreeNode root = new TreeNode();
        root.val = arr[l];
        int mid = l;
        for(int i = l+1; i < r; i++){
            if(arr[i] < root.val){
                mid = i;
            }
            else{
                break;
            }
        }
        
        root.left = helper(l+1, mid+1);
        root.right = helper(mid+1, r);
        
        return root;
    }
}
