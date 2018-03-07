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
    
    Integer prev;
    int max;
    int count;
        
    public int[] findMode(TreeNode root) {
        
        if(root==null)  return new int[0];
        
        count = 0;
        max = 0;
        prev = null;
        
        //for max freq values
        List<Integer> list = new ArrayList<Integer>();
        
        traverseTree(root, list);
        
        //conersion to array
        int[] mode = new int[list.size()];
        for(int i=0; i<mode.length; i++){
            mode[i] = list.get(i);
        }
        
        return mode;
        
    }
    
    //function for inorder traversal of the bst.
    void traverseTree(TreeNode root, List<Integer> list){
        
        if(root == null)    return;
        
        traverseTree(root.left, list);
        
        //since bst all values will be sorted in inorder traversal
        //checking if prev is same as current and updating count
        if(prev!=null && root.val==prev){
            count++;
        }else{
            count = 1;
        }
        
        //checking and updating max and list
        if(count>max){
            list.clear();
            list.add(root.val);
            max = count;
        }else if(count==max){
            list.add(root.val);
        }
        
        prev = root.val;
        traverseTree(root.right, list);
    }
}
