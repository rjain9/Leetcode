class Solution {
    public int hammingDistance(int x, int y) {
        
        //Taking XOR between x and y and counting bits
        return Integer.bitCount(x^y);
    }
}
