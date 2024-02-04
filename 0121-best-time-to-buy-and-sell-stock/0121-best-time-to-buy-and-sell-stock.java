class Solution {
    public int maxProfit(int[] prices) {
       int max1=0;
        int n=prices.length;
        int dif_max=0;
        for(int i=n-1;i>=0;i--){
            if(prices[i]>max1){
                max1=prices[i];
            }
            else{
                int t=max1-prices[i];
                if(t>dif_max){
                    dif_max=t;
                }
            }
        }
        return dif_max;
    }
}