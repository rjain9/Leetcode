class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        
        if(A.length==0 || A[0].length==0)   return null;
        
        int m = A.length;
        int n = A[0].length;
        int[][] result = new int[m][n];
        
        //flipping and inverting in the same step
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                result[i][n-j-1] = A[i][j] ^ 1;
            }
        }
        
        return result;
    }
}
