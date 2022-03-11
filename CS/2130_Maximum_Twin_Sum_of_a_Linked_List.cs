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
    public int PairSum(ListNode head) {
        List<int> list = new List<int>();
        while(head != null){
            list.Add(head.val);
            head = head.next;
        }
        int result = 0;
        int h = list.Count;
        for(int i = 0; i < h/2; i++){
            result = Math.Max(result, list[i] + list[h-i-1]);
        }
        return result;
    }
}
