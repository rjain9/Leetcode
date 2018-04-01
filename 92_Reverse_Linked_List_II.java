/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        //null check
        if(head==null || head.next==null)   return head;
        
        ListNode fake = new ListNode(-1);
        fake.next = head;
        ListNode pre = fake;
        
        //traverse to the node before m
        int i = 1;
        while(i<m){
            pre = pre.next;
            i++;
        }
        
        //in place reverse
        i=0;
        ListNode start = pre.next;
        ListNode end = pre.next;
        while(i<(n-m)){
            pre.next = end.next;
            end.next = pre.next.next;
            pre.next.next = start;
            start = pre.next;
            i++;
        }
        
        return fake.next;
    }
}
