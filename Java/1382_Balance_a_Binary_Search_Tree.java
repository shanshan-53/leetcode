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
    public TreeNode balanceBST(TreeNode root) {
        
        addToList(root);
        //System.out.println(list);
        
        TreeNode result = build(list.stream().mapToInt(i->i).toArray());
        
        return result;
    }
    public TreeNode build(int[] arr){
        int n = arr.length;
        if(n == 0){
            return null;
        }
        
        int mid = n/2;
        TreeNode node = new TreeNode(arr[mid]);
        
        int[] left = new int[mid];
        int[] right = new int[n-mid-1];
        
        System.arraycopy(arr, 0, left, 0, mid);
        System.arraycopy(arr, mid+1, right, 0, n-mid-1);
        
        node.left = build(left);
        node.right = build(right);
        
        return node;
    }
    
    
    public void addToList(TreeNode root){
        if(root.left != null)  
            addToList(root.left);
        
        list.add(root.val);
        
        if(root.right != null)
            addToList(root.right);
    }
}
