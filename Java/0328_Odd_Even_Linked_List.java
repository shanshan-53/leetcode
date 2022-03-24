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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddHead = odd;
        ListNode evenHead = even;
        ListNode current = even.next;
        int i = 3;
        while(current != null){
            if(i%2 == 1){
                odd.next = current;
                odd = odd.next;
                even.next = null;
            }
            else{
                even.next = current;
                even = even.next;
                odd.next = null;
            }
            current = current.next;
            i++;
        }
        
        odd.next = evenHead;
        return oddHead;
    }
}
/*
head
1 2 3 4 5

odd
1 3 5

even
2 4

temp
2 3 4 5

current
5
*/
