class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        
        //As they differ in only one character xor all the characters
        for(char c:s.toCharArray())   result^=c;
        for(char c:t.toCharArray())   result^=c;
        
        return result;
    }
}
