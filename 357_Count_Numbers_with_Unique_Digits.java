class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        //Can be solved using permutation combination
        if(n==0)    return 1;
        if(n==1)    return 10;
        int result = 10;
        int product = 9;
        int factor = 9;
        for(int i = 2; i<=n; i++){
            if(i>10)    return result;
            product *= factor;
            result+=product;
            factor--;
        }
        return result;
    }
}
