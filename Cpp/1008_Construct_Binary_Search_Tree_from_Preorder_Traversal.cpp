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
    TreeNode* bstFromPreorder(vector<int>& preorder) {
        if(preorder.size() > 0){
            return helper(preorder, 0, preorder.size()-1);
        }
        return nullptr;
    }
private:
    TreeNode* helper(vector<int>& preorder, int start, int end){
        if(start <= end){
            TreeNode* result = new TreeNode(preorder[start]);
            int mid = end;
            for(int i = start+1; i < preorder.size(); i++){
                if(preorder[i] > preorder[start]){
                    mid = i-1;
                    break;
                }
            }
            result->left = helper(preorder, start+1, mid);
            result->right = helper(preorder, mid+1, end);
            return result;
        }
        return nullptr;
    }
};
