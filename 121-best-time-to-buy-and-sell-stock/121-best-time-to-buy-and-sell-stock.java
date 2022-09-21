class Solution {
    public int maxProfit(int[] prices) {
           if(prices.length == 1) return 0;
        int currentMinimum = prices [0];
        int maxProfit = 0;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            currentMinimum = Math.min(currentMinimum, prices[i]);
            profit = prices[i] - currentMinimum;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}