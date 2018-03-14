class Solution {
    public boolean rotateString(String A, String B) {
        boolean result = (A.length()==B.length()) && ((A+A).contains(B));
        return result;
    }
}
