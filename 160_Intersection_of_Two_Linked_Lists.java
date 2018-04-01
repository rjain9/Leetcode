/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode pointerA = headA;
        ListNode pointerB = headB;
        
        int a = 0;
        int b = 0; 
        
        //Calculate lengths
        while(pointerA!=null){
            pointerA = pointerA.next;
            a++;
        }
        while(pointerB!=null){
            pointerB = pointerB.next;
            b++;
        }
        
        pointerA = headA;
        pointerB = headB;
        
        //move the pointer of longer linkedlist ahead
        while(a>b){
            pointerA = pointerA.next;
            a--;
        } 
        while(b>a){
            pointerB = pointerB.next;
            b--;
        }
        
        //find intersection point
        while(pointerA!=pointerB){
            pointerA = pointerA.next;
            pointerB = pointerB.next;
        }
        
        return pointerA;
    }
}
