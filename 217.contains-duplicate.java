/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

Import java.util.HashMap;
Import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Inteager> map = new HashMap<>();

        for(int c : nums){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(int count : map.values()){
            if(count >=2){
                return ture;
            }
        }
        return false;
    }
}

class Solution1 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int c :nums){
            if(set.contains(c)){
                return true;
            }
            set.add(c);
        }
        return false;
    }
}

// @lc code=end

