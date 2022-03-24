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
    
    List<Integer> result = new ArrayList<>();
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        
        addToStack(root1, stack1);
        addToStack(root2, stack2);
        
        while(stack1.size() != 0 && stack2.size() != 0){
            if(stack1.peek().val < stack2.peek().val){
                result.add(stack1.peek().val);
                stack1.pop();
            }
            else{
                result.add(stack2.peek().val);
                stack2.pop();
            }
        }
        
        while(stack1.size() != 0){
            result.add(stack1.peek().val);
            stack1.pop();
        }
        while(stack2.size() != 0){
            result.add(stack2.peek().val);
            stack2.pop();
        }
        
        return result;
    }
    private void addToStack(TreeNode root, Stack<TreeNode> stack){
        if(root != null){
            addToStack(root.right, stack);
            stack.push(root);
            addToStack(root.left, stack);
        }
    }
    /*  
        if(root1 != null){
            addToList(root1);
        }
        if(root2 != null){
            addToList(root2);
        }
        
        Collections.sort(result);
        return result;
    }
    public void addToList(TreeNode root){
        if(root == null)
            return;
        
        result.add(root.val);
        addToList(root.left);
        addToList(root.right);
        
    }
    */
    /*
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> result = new ArrayList<>();
        if(root1 != null){
            result.add(root1.val);
            result.addAll(getAllElements(root1.left, root1.right));
        }
        if(root2 != null){
            result.add(root2.val);
            result.addAll(getAllElements(root2.left, root2.right));
        }
        
        Collections.sort(result);
        return result;
    }
    */
}
