/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        if(head == null || head.next == null){
            return null;
        }
        
        ListNode result = new ListNode(0);
        ListNode cur = result;
        head = head.next;
        
        int temp = 0;
        while(head!=null){
            temp += head.val;
            if(head.val == 0){
                cur.next = new ListNode(temp);
                cur = cur.next;
                temp = 0;
            }
            head = head.next;
        }
        return result.next;
    }
}
