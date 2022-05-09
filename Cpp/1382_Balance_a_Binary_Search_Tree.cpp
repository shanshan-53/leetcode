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
    TreeNode* balanceBST(TreeNode* root) {
        vector<int> v;
        toList(v, root);
        TreeNode* result = new TreeNode();
        result = toTree(v, result, 0, v.size()-1);
        return result;
    }
    TreeNode* toTree(vector<int>  v, TreeNode* result, int start, int end){
        if(start <= end){
            TreeNode* result = new TreeNode();
            int mid = start + ((end - start) / 2);
            result->val = v[mid];
            result->left = toTree(v, result, start, mid-1);
            result->right = toTree(v, result, mid+1, end);
            return result;
        }   
        return nullptr;
    }
    void toList(vector<int>& v, TreeNode* root){
        if(root != nullptr){
            toList(v, root->left);
            v.push_back(root->val);
            toList(v, root->right);
        }
    }
};
