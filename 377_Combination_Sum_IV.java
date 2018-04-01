class Solution {
    
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    
    public int combinationSum4(int[] nums, int target) {
        //to keep track of count
        int count = 0;
        
        //make sure the check for target<0
        if(nums == null || nums.length == 0 || target < 0)    return 0;
        
        //check for target < 1
        if(target == 0) return 1;
        
        //if count for a particular target already calculated
        if(map.containsKey(target)) return map.get(target);
        
        //recursive calculation of all possible solutions
        for(int num : nums) count += combinationSum4(nums, target-num);
        
        //add the count for the target in the map
        map.put(target, count);
        
        return count;
         
    }
}
