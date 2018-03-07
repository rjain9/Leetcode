class Solution {
    public int maxProfit(int[] prices) {
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            
            if(prices[i]<minPrice){
                //update minPrice everytime a new minimum is reached
                minPrice = prices[i];
            }
            
            if(prices[i]-minPrice>maxProfit){
                //update maxProfit everytime a new maximum is reached
                maxProfit = prices[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
