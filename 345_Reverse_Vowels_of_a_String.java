class Solution {
    public String reverseVowels(String s) {
        
        //Set to hold vowels
        Set<Character> set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        
        char[] c = s.toCharArray();
        int i = 0;
        int j = c.length-1;
        
        //2 pointers starting at different ends
        while(i<j){
            if(set.contains(c[i]) && set.contains(c[j])){
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }
            if(!set.contains(c[i])) i++;
            if(!set.contains(c[j])) j--;
        }
        
        return new String(c);
    }
}
