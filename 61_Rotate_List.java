/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null || head.next == null || k==0)   return head;
        
        //fast pointer to identify length
        ListNode fast = head;
        int n = 1;
        while(fast.next!=null){
            fast = fast.next;
            n++;
        }
        k = k%n;
        if(k == 0)  return head;
        
        //slow pointer to find the point of rotation
        ListNode slow = head;
        int i = 1;
        while(i!=n-k){
            slow = slow.next;
            i++;
        }
        
        //rotate list
        ListNode result = slow.next;
        slow.next = null;
        fast.next = head;
        
        return result;
        
    }
}
