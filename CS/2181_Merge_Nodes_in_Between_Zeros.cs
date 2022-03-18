/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int val=0, ListNode next=null) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
public class Solution {
    public ListNode MergeNodes(ListNode head) {
        ListNode result = new ListNode(0);
        ListNode temp = result;
        int sum = 0;
        head = head.next;
        while(head!=null){
            if(head.val == 0){
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            else{
                sum += head.val;
            }
            head = head.next;
        }
        return result.next;
    }
}
