class Solution {
    public int[] plusOne(int[] digits) {
        
        int n = digits.length;
        
        for(int i = n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else{
                digits[i] = 0;
            }
        }
        
        //if it reaches a point that all digits are 9
        int[] digits2 = new int[n+1];
        digits2[0] = 1;
        
        return digits2;
    }
}
