class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        
        //null check
        if(matrix.length==0 || matrix[0].length==0) return new int[0];
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] result = new int[m*n];
        
        int x=0;
        int y=0;
        //to change the direction
        
        boolean flag = true;
        
        for(int i = 0; i<result.length; i++){
            
            //conditions to change direction once an end is reached
            if(x>=m && flag==false){
                y+=2;
                x--;
                flag = true;
            }
            if(y>=n && flag==true){
                x+=2;
                y--;
                flag = false;
            }
            if(x<0 && flag==true){
                x = 0;
                flag = false;
            }
            if(y<0 && flag==false){
                y = 0;
                flag = true;
            }
            
            //add to result array
            result[i]=matrix[x][y];
            
            //index update based on direction
            if(flag){
                x--;
                y++;
            }else{
                x++;
                y--;
            }
        }
        
        return result;
    }
}
