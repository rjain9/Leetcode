/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
        if(head==null)   return null;
            
        return listToBST(head, null);
    }
    
    //Simple approach - find mid make root
    //root.left - left of mid
    //root.right - right of mid
    public TreeNode listToBST(ListNode start, ListNode end){
        
        if(start==end)  return null;
        
        ListNode slow = start;
        ListNode fast = start;
        
        while(fast!=end && fast.next!=end){
            fast = fast.next.next;
            slow = slow.next;
        }
                        
        TreeNode root = new TreeNode(slow.val);
        root.left = listToBST(start, slow);
        root.right = listToBST(slow.next, end);
        
        return root;
    }
}
