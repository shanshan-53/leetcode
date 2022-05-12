public class Solution {
    public class ListNode{
        public int val;
        public ListNode next;
    }
    public int FindTheWinner(int n, int k) {
        ListNode head = new ListNode {val = 1};
        ListNode tail = head;
        ListNode nextNode;
        for(int i = 2; i <= n; i++){
            nextNode = new ListNode {val = i};
            tail.next = nextNode;
            tail = tail.next;
        }
        tail.next = head;
        
        while(head != tail){
            for(int i = 1; i < k; i++){
                head = head.next;
                tail = tail.next;
            }
            tail.next = head.next;
            head = tail.next;
        }
        return head.val;
    }
}
/*
1 2 3 4 6
        h
      t  
public class Solution {
    public int FindTheWinner(int n, int k) {
        List<int> list = new List<int>();
        int result = 0;
        for(int i = 1; i <= n; i++){
            list.Add(i);
        }
        int index = k-1;
        while(list.Count > 1){
            list.RemoveAt(index);
            index = (index + k-1) % list.Count;
        }
        return list[0];
    }
}
*/
