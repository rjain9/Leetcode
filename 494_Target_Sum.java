class Solution {
    int count;
    public int findTargetSumWays(int[] nums, int S) {
        count = 0;
        
        if (nums == null || nums.length == 0) return count;
        
        int n = nums.length;
        int[] sums = new int[n];
        
        //optimising by calcaulating sum of all the elements from index to end of array
        sums[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            sums[i] = sums[i+1]+nums[i];
        }
        //DFS
        calculateWays(nums, sums, S, 0, 0);
        return count;
    }
    public void calculateWays(int[]nums, int[] sums, int target, int i, int sum){
        if(i==nums.length){
            if(sum==target)      count++;
            return;
        }
        if(sum+sums[i]<target)  return;
        
        calculateWays(nums, sums, target, i+1, sum+nums[i]);
        calculateWays(nums, sums, target, i+1, sum-nums[i]);
        
    }
}
