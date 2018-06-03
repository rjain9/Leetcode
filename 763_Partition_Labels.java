class Solution {
    public List<Integer> partitionLabels(String S) {
        
        List<Integer> result = new ArrayList<>();
        
        if(S==null || S.length()==0)    return result;
        
        int left = 0;
        int right = 0;
        
        //start traversing the string and compare the last index of the current char
        for(int i=0; i<S.length(); i++){
            if(i>right){
                result.add(right-left+1);
                left = i;
            }
            right = Math.max(right, S.lastIndexOf(S.charAt(i)));
        }
        
        result.add(right-left+1);
        
        return result;
    }
}
