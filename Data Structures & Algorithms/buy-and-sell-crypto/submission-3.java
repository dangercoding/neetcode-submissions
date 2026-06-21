class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int buy=0;
        int sell=buy+1;

        while(sell<=prices.length-1){

            int currentProfit=prices[sell]- prices[buy];

            if(currentProfit>profit){
                profit=currentProfit;
                
            }else{
                
                if(prices[buy]>=prices[sell]){
                   buy=sell;
                }
            }

            sell++;

        }

        return profit;
        
    }
}
