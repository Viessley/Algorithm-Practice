/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        for (int next : nums){
            if(set.contains(next)){
                return true;
            }
            set.add(next);
        }

        return false;
    }
}
// @lc code=end

