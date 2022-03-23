/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

class Solution {
public:
    TreeNode* result;
    TreeNode* getTargetCopy(TreeNode* original, TreeNode* cloned, TreeNode* target) {
        if(!original){
            return nullptr;
        }
        
        if(original == target){
            result = cloned;
        }
        else{
            getTargetCopy(original->left, cloned->left, target);
            getTargetCopy(original->right, cloned->right, target);
            /*
            TreeNode* left = getTargetCopy(original->left, cloned->left, target);
            return left != nullptr ? left : getTargetCopy(original->right, cloned->right, target);
            */
        }
        return result;
    }
};
