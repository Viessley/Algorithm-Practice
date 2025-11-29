/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int lowestBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int nextPrice: prices){
            lowestBuy = Math.min(lowestBuy, nextPrice);
            maxProfit = Math.max(maxProfit, nextPrice - lowestBuy);
        }
        return maxProfit;
    }
}
// @lc code=end

