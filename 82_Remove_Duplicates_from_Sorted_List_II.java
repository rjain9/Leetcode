/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head == null || head.next == null)   return head;
        
        //fake head
        ListNode temp = new ListNode(-1);
        temp.next = head;
        
        //prev - last distinct node
        ListNode prev = temp;
        //current node
        ListNode cur = head;
        
        while(cur!=null){
            
            //next node until duplicate nodes
            while(cur.next!=null && cur.val == cur.next.val){
                cur = cur.next;
            }
            
            //assign prev according to distinct or duplicate
            if(prev.next == cur){
                prev = prev.next;
            }else{
                prev.next = cur.next;
            }
            
            cur = cur.next;
        }
        
        return temp.next;
    }
}
