/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeNodes(ListNode* head) {
        ListNode* result = new ListNode;
        ListNode* temp = result;
        int sum = 0;
        head = head->next;
        
        while(head != nullptr){
            sum += head->val;
            if(head->val == 0){
                temp->next = new ListNode(sum);
                temp = temp->next;
                sum = 0;
            }
            head = head->next;
        }
        return result->next;
    }
};
