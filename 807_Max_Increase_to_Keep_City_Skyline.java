class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        
        //to store max of each row and col
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        int sum = 0;
        
        //calculate the max of each row and col
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                row[i] = Math.max(row[i], grid[i][j]);
                col[j] = Math.max(col[j], grid[i][j]);            
            }
        }
        
        //updating buildin lengths and calculate the result
        for(int i=0; i<grid.length; i++)
            for(int j=0; j<grid[0].length; j++)
                sum += Math.min(row[i], col[j]) - grid[i][j];
        
        return sum;
        
    }
}
