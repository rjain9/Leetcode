/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        //Simple traverse the list and assign accordingly approach
        
        if(head==null || head.next==null)   return head;
        
        ListNode fake = new ListNode(-1);
        fake.next = head;
        
        ListNode point = fake;
        ListNode pre = fake;
        ListNode cur = head;
        
        while(cur!=null){
            if(cur.val<x){
                pre.next = cur.next;
                cur.next = point.next;
                point.next = cur;
                if(pre == point)    pre = pre.next;
                point = point.next;
                cur = pre.next;
            }else{
                cur = cur.next;
                pre = pre.next;
            }
        }
        
        return fake.next;
    }
}
