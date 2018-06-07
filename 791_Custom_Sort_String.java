class Solution {
    public String customSortString(String S, String T) {
        
        int[] letters = new int[26];
        StringBuilder sb = new StringBuilder();
        
        for(char c : T.toCharArray()){
            letters[c-'a']++;
        }
        
        for(char c : S.toCharArray()){
            while(letters[c-'a']>0){
                sb.append(c);
                letters[c-'a']--;
            }
        }
        
        for(int i=0;i<26; i++){
            while(letters[i]>0){
                sb.append((char)('a'+i));
                letters[i]--;
            }
        }
        
        return sb.toString();
    }
}
