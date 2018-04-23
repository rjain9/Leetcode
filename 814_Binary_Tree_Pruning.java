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
    public TreeNode pruneTree(TreeNode root) {
        
        boolean tree = test(root);
        
        if(tree)    return root;
        else        return null;
        
    }
    
    //helper function to traverse the tree and remove nodes with no 1 children
    public boolean test(TreeNode root){
        
        if(root == null)    return false;
        
        boolean left = test(root.left);
        boolean right = test(root.right);
        
        if(!left)   root.left = null;
        if(!right)  root.right = null;
        
        if(!(left || right) && root.val == 0)   return false;
        else return true;
    }
}
