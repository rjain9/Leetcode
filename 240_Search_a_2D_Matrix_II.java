class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix==null || matrix.length<=0 || matrix[0].length<=0){
            return false;
        }
        
        //Start top-right of the matrix and travel diagonally to bottom-left
        int i = matrix.length-1;
        int j = 0;
        
        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j] == target){
                return true;
            }else if(matrix[i][j] < target){
                j++;
            }else{
                i--;
            }
        }
        return false;
    }
}
