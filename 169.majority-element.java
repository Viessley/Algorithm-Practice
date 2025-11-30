/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
Import java.util.HashMap;

class Solution { // 114 ms Runtime. 
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int e : nums){
            map.put(e, map.getOrDefault(e, 0)+ 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > (nums.length/2)){
                return entry.getKey();
            }
        }
    }
}

class Solution1 { // 114 ms Runtime. 
    public int majorityElement(int[] nums) {
        
    }
}
// @lc code=end

