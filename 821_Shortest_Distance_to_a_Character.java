class Solution {
    public int[] shortestToChar(String S, char C) {
        
        int[] result = new int[S.length()];
        
        //first and second index of char C
        int start = S.indexOf(C);
        int end = S.indexOf(C, start+1);
        
        for(int i = 0; i < S.length(); i++){
            
            if(i<start){
                result[i] = start - i;
            }else if(i<=end && start < end) {
                result[i] = Math.min(i-start, end-i);
                if(i == end){
                    start = end;
                    end = S.indexOf(C, end+1);
                }
            }else{
                result[i] = i - start;
            }
        }
        return result;
    }
}
