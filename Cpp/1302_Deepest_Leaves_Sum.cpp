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
    int deepest = 0;
    int result = 0;
    int deepestLeavesSum(TreeNode* root) {
        getDeep(root, 0);
        
        helper(root, 0);
        
        return result;
    }
    void helper(TreeNode* root, int d){
        if(root == nullptr){
            return;
        }
        d+=1;
        if(d == deepest){
            result += root->val;
            return;
        }
        helper(root->left, d);
        helper(root->right, d);
    }
    
    void getDeep(TreeNode* root, int d){
        if(root == nullptr){
            return;
        }
        d += 1;
        deepest = max(d, deepest);
        getDeep(root->left, d);
        getDeep(root->right, d);
    }
};
