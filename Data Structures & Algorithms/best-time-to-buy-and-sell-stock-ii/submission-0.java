class Solution {
    public int maxProfit(int[] prices) {

        if(prices.length==0 || prices.length==1) return 0;
        int fProfit=0;
        int profit=0;
        int buy= prices[0];
        int sell=0;

        for(int i=1;i<prices.length;i++){

            

                if(prices[i]>buy){
                    int sum=(prices[i]-buy);
                    if(profit<sum){
                       profit=sum;
                    }else{
                       fProfit= fProfit+profit;
                       buy= prices[i];
                       profit=0;
                    }
                    
                   if(i==prices.length-1){
                    fProfit= fProfit+profit;
                   }
                    

                }else{
                     fProfit= fProfit+profit;
                       buy= prices[i];
                       profit=0;
                    

                }
            

            
        }


        return fProfit;
        
    }
}