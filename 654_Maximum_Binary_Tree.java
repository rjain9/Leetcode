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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
    
        return construct(nums, 0, nums.length-1);
    
    }
    
    //function to construct the max binary tree
    public TreeNode construct(int[] nums, int l, int r){
        
        if(l==r) return new TreeNode(nums[l]);
        
        int index = maxIndex(nums, l ,r);
        
        TreeNode root = new TreeNode(nums[index]);
        
        //recursively constructs left and right subtrees
        if(l<index)     root.left = construct(nums, l, index-1);
        if(r>index)     root.right = construct(nums, index+1, r);
        
        return root;
    }
    
    //function to find the index of the maximum number in the subarray
    public int maxIndex(int[] nums, int l, int r){
        
        int index=0;
        int max = 0;
        
        for(int i=l; i<=r; i++){
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        
        return index;
    }
}
