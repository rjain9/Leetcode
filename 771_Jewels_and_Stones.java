class Solution {
    public int numJewelsInStones(String J, String S) {
        
        //Checking for 0 length Strings
        if(J.length()==0 || S.length()==0){
            return 0;
        }
        
        int count=0;
        HashSet<Character> set = new HashSet<>();
        
        //Storing Jewels in HashSet
        for(char c:J.toCharArray()){
            set.add(c);
        }
        //Checking if the HashSet has the stones listed in S
        for(char c:S.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }
        return count;
    }
}
