class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            min=(int)Math.min(min,prices[i]);
            profit=(int)Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}