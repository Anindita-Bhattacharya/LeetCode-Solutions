class Solution {
    public int maxProfit(int[] prices)
    {
        int max_profit=0;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            mini=Math.min(mini,prices[i]);
            max_profit=Math.max(max_profit,prices[i]-mini);
        }
        return max_profit;
    }
}