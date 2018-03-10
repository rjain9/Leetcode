//If difficult to understand --> dry run
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        
        //to store the index of the next greater element
        Stack<Integer> stack = new Stack<Integer>();
        //to store end result
        int[] result = new int[nums.length];
        
        //Iteration 1
        for(int i = nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = nums[stack.peek()];
            }else{
                result[i] = -1;
            }
            stack.push(i);
        }
        
        //Iteration 2
        for(int i = nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = nums[stack.peek()];
            }else{
                result[i] = -1;
            }
            stack.push(i);
        }
        
        return result;
    }
}
