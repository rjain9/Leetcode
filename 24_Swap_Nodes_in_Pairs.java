/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)   return head;
        
        ListNode fake = new ListNode(-1);
        fake.next = head;
        
        ListNode pre = fake;
        ListNode cur = head;
        
        while(pre!=null && cur!=null && cur.next!=null){
            pre.next = cur.next;
            cur.next = pre.next.next;
            pre.next.next = cur;
            pre = pre.next.next;
            cur = pre.next;
        }
        
        return fake.next;
    }
}
