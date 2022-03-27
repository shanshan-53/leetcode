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
    HashMap<Integer, List<TreeNode>> m = new HashMap<>();
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> result = new ArrayList<>();
        if(n%2 == 0){
            return result;
        }
        if(n == 1){
            TreeNode root = new TreeNode(0);
            result.add(root);
            m.put(n, result);
        }
        else{
            for(int i = 1; i < n-1; i++){
                List<TreeNode> leftTree = m.containsKey(i) ? m.get(i) : allPossibleFBT(i);
                
                List<TreeNode> rightTree = m.containsKey(n-1-i) ? m.get(n-1-i) : allPossibleFBT(n-1-i);
                
                for(TreeNode leftNode : leftTree){
                    for(TreeNode rightNode : rightTree){
                        TreeNode root = new TreeNode(0);
                        root.left = leftNode;
                        root.right = rightNode;
                        result.add(root);
                        if(!m.containsKey(n)){
                            m.put(n, result);
                        }
                    }
                }
            }
        }
        return result;
    }
}
