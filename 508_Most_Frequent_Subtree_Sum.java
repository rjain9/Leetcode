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
    int max;
    HashMap<Integer, Integer> map;
    
    public int[] findFrequentTreeSum(TreeNode root) {
        //to store the max count value;
        max = Integer.MIN_VALUE;
        //to store sums and the frequency of those sums.
        map = new HashMap<Integer, Integer>();
        //to store the most frequent sums
        List<Integer> result = new ArrayList<Integer>();
        
        traverseTree(root);
        
        //traversing each entry in the map to check for the most frequent values
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()==max){
                result.add(entry.getKey());
            }
        }
        
        //convert list to int array
        int[] solution = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            solution[i] = result.get(i);
        }        
        return solution;
    }
    /**
     * Function to traverse the tree and calculate the sum associated with each node
     * @param   TreeNode root - the node who's sum is to be calculated.
     * @return  int sum - sum associated with the root.
    **/
    public int traverseTree(TreeNode root){
        //null check - if null return sum as 0
        if(root==null)  return 0;
        
        //to evaluate sum which is val + left sum + right sum
        int sum = root.val+traverseTree(root.left)+traverseTree(root.right);
        int count = 1;
        
        //check if map already contains the sum if so update count
        if(map.containsKey(sum)){
            count += map.get(sum);
        }
        map.put(sum, count);
        
        //update most frequent count
        if(count>max){
            max = count;
        }
        return sum;
    }
}
