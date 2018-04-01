class Solution {
    public String licenseKeyFormatting(String s, int k) {
                
        StringBuilder result = new StringBuilder();
        
        char[] c = s.toCharArray();
        
        for(int i = c.length-1; i>=0; i--){
            if(c[i] != '-'){
                result.append((result.length()%(k+1)==k)? "-" : "").append(Character.toUpperCase(c[i]));
            }
        }
        
        return new String(result.reverse());
        
    }
}
