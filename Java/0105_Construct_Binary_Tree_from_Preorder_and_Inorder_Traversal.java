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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        //TreeNode root = helper(preorder, inorder, 0, preorder.length, 0, inorder.length);
        if(preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode();
        int v = preorder[0];
        root.val = v;
        int index = 0;
        for(int i = 0; i < inorder.length; i++){
            if(inorder[i] == v){
                index = i;
                break;
            }
        }
        
        root.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        root.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
        
        return root;
    }
    /*
    private TreeNode helper(int[] preorder, int[] inorder, int pStart, int pEnd, int iStart, int iEnd) {
        if(pStart > preorder.length-1 || iStart > inorder.length-1 || pStart >= pEnd || iStart >= iEnd){
            return null;
        }
        TreeNode root = new TreeNode();
        int v = preorder[pStart];
        root.val = v;
        int index = -1;
        for(int i = iStart; i < iEnd; i++){
            if(inorder[i] == v){
                index = i;
                break;
            }
        }
        
        root.left = helper(preorder, inorder, pStart+1, index-iStart + pStart+1, iStart, index);
        root.right = helper(preorder, inorder, index - iStart + pStart +1, pEnd, index+1, iEnd);
        return root;
    }
    */
}
/*
[3,9,20,15,7]
[9,3,15,20,7]
0 5 0 5
Tree
 3
9 20 
index 1 0 3
1 2 0 1
2 2 0 0
2 2 1 1

2 5 2 5
3 4 0 3
*/
