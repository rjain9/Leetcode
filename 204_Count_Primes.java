class Solution {
    public int countPrimes(int n) {
        int count=0;
        
        //To reduce the calculation sby 1/2 by removing all multiples of 2.
        if(n>2) count++;
        else    return count;
        
        //Array to store if: Prime- false; composite- true
        boolean[] arr = new boolean[n];
        
        for(int i=3; i<n; i+=2){
            
            //check if prime
            if(!arr[i]){
                count++;
                
                //loop to set all the values of the multiples of the prime number true
                for(int j=2; i*j<n; j++){
                    arr[i*j] = true;
                }
            }
        }
        return count;
    }
}
