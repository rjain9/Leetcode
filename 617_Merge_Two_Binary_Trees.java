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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        
        //case if both not null
        if(t1!=null && t2!=null){
            t1.val = t1.val + t2.val;
            t1.left = mergeTrees(t1.left, t2.left);
            t1.right = mergeTrees(t1.right, t2.right);
            
        }else if(t2!=null){// case if t2 not null and t1 null
            t1 = t2;
        }
        //case automatically covered if t1 not null and t2 null
        return t1;
    }
}
