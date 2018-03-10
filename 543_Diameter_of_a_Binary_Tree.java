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
    
    int diameter;
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        diameter = 0;
        
        if(root==null)  return diameter;
        
        maxDepth(root);
        
        return diameter;
    }
    
    /**
     * Max depth from a node to the end of the tree.
     */
    int maxDepth(TreeNode root){
        
        if(root==null)  return 0;
        
        //max depth of left subtree
        int maxLeft = maxDepth(root.left);
        //max depth of right subtree
        int maxRight = maxDepth(root.right);
        
        //update max diameter if needed
        if((maxLeft+maxRight)>diameter){
            diameter = maxLeft+maxRight;
        }
        
        return 1+Math.max(maxLeft, maxRight);
        
    }
}
