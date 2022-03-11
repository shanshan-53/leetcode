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
    private List<Integer> list = new ArrayList<>();
    
    public int pairSum(ListNode head) {
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int result = 0;
        for(int i = 0; i < list.size(); i++){
            result = Math.max(result, list.get(i) + list.get(list.size()-1 - i));
        }
        return result;
    }
}
/*
5 4 2 1 0 3
      s
            f
    t
2 4 5
p
t

null
p

ListNode slow = head, fast = head, prev = null;
     
        while (fast != null && fast.next != null) {
            ListNode temp = slow;
            slow = temp.next;
            fast = fast.next.next;
            temp.next = prev;
            prev = temp;
        }
        
        int max = 0;
        while (slow != null) {
            max = Math.max(max, prev.val+slow.val);
            slow = slow.next;
            prev = prev.next;
        }
        return max;
    }

*/


