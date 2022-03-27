/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int sumEvenGrandparent(TreeNode* root) {
        int result = 0;
        result += helper(-1, -1, root);
        return result;
    }
    int helper(int grandparent, int parent, TreeNode* root){
        if(root == nullptr){
            return 0;
        }
        
        if(grandparent%2 == 0){
            return root->val + helper(parent, root->val, root->left) + helper(parent, root->val, root->right);
        }
        else{
            return helper(parent, root->val, root->left) + helper(parent, root->val, root->right);
        }
    }
};
