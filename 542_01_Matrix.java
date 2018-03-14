//A simple BFS approach
class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        
        if(matrix.length==0 || matrix[0].length==0) return matrix;
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        Queue<int[]> queue = new LinkedList<>();
        
        //update matrix for initial values
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j]==0){
                    queue.offer(new int[] {i,j});
                }else{
                    matrix[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        
        int[][] direction = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        
        while(!queue.isEmpty()){
            
            int[] current = queue.poll();
            
            //for all cardinal neighbors
            for(int[] d: direction){
                
                int x = current[0] + d[0];
                int y = current[1] + d[1];
                
                //update if a smaller distance is found
                if(x<0 || x>=m || y<0 || y>=n || matrix[x][y]<(matrix[current[0]][current[1]]+1))    
                    continue;
                else{
                    matrix[x][y] = matrix[current[0]][current[1]]+1;
                    queue.offer(new int[] {x,y});
                }
            }
        }
        return matrix;
    }
}
