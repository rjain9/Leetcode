class Solution{
    public int longestPalindromeSubseq(String s) {
        //reversing the string and finding lcs
        
        int n = s.length();
        String t = new String(new StringBuilder(s).reverse());
        
        int[][] lcs = new int[n+1][n+1];
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    lcs[i][j] = lcs[i-1][j-1]+1;
                }else{
                    lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
                }
            }
        }
        
        return lcs[n][n];
    }
}
