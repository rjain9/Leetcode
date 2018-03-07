class Solution {
    public int firstUniqChar(String s) {
        //to store letter count
        int[] letters = new int[26];
        
        //update array
        for(int i=0; i<s.length(); i++){
            letters[s.charAt(i)-97]++;
        }
        
        //find first unique letter
        for(int i=0; i<s.length(); i++){
            if(letters[s.charAt(i)-97]==1){
                return i;
            }
        }
        
        return -1;
    }
}
