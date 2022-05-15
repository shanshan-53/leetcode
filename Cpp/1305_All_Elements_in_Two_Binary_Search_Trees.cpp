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
    vector<int> v1;
    vector<int> v2;
    
    vector<int> getAllElements(TreeNode* root1, TreeNode* root2) {
        helper(root1, v1);
        helper(root2, v2);
        vector<int> result;
        int i = 0;
        int j = 0;
        while(i != v1.size() || j != v2.size()){
            if(i == v1.size()){
                result.push_back(v2[j]);
                j++;
            }
            else if(j == v2.size()){
                result.push_back(v1[i]);
                i++;
            }
            else{
                if(v1[i] < v2[j]){
                    result.push_back(v1[i]);
                    i++;
                }
                else if(v1[i] > v2[j]){
                    result.push_back(v2[j]);
                    j++;
                }
                else{
                    result.push_back(v1[i]);
                    result.push_back(v2[j]);
                    i++;
                    j++;
                }
            }
        }
        return result;
    }
private:
    void helper(TreeNode* root, vector<int>& v){
        if(root != nullptr){
            helper(root->left, v);
            v.push_back(root->val);
            helper(root->right, v);
        }
    }
};
/*
class Solution {
public:
    vector<int> result;
        
    vector<int> getAllElements(TreeNode* root1, TreeNode* root2) {
        helper(root1);
        helper(root2);
        sort(result.begin(), result.end());
        return result;
    }
private:
    void helper(TreeNode* root){
        if(root != nullptr){
            helper(root->left);
            result.push_back(root->val);
            helper(root->right);
        }
    }
};
*/
