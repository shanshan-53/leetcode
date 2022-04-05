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
    int getDecimalValue(ListNode* head) {
        return head ? getDecimalValue(head->next,result*2+head->val) : result;
        /*
        int result = 0;
        while(head != nullptr){
            result <<= 1;
            //cout << result;
            result |= head->val;
            //cout << result;
            head = head->next;
        }
        return result;
        */
    }
};
