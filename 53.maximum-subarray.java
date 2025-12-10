/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int historyMaxSum = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            historyMaxSum = Math.max(currentSum, historyMaxSum);
        }

        return historyMaxSum;        
    }
}
// @lc code=end

