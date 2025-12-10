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

        for(int next : prices){
            lowestBuy = Math.min(lowestBuy, next);
            maxProfit = Math.max(maxProfit, next - lowestBuy);
        }
        return maxProfit;
    }
}
// @lc code=end

