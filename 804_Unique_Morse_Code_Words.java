class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        Set<String> set = new HashSet<>();
        
        //Adding morse string corresponding to each word in the set.
        for(String word : words){
            StringBuilder temp = new StringBuilder();
            for(char c : word.toCharArray()){
                temp.append(morse[c-'a']);
            }
            set.add(temp.toString());
        }
        
        return set.size();
    }
}
