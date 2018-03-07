/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //null check
        if(head==null || head.next==null)  return head;
        
        //simple code to put the next node right at the beginning of the list till we reach the last node.
        ListNode current = head.next;
        ListNode previous = head;
        while(current!=null){
            head.next = current.next;
            current.next = previous;
            previous = current;
            current = head.next;
        }
        return previous;
    }
}
