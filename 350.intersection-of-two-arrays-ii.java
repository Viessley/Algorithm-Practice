/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
Import java.util.map;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();        
            for(int e : nums1){
                map.put(e, map.getOrDefault(e, 0) + 1);
            }

        List<Integer> outcome = new ArrayList<>();
            for(int e : nums2){
                if(map.containsKey(e) && map.get(e) > 0){
                    outcome.add(e);
                    map.put(e, map.get(e) - 1);
                }
            }
            
        int[] result = new int[outcome.size()];
            for(int i = 0; i < outcome.size(); i++){
                result[i] = outcome.get(i);
            }

        return result;
    }
}
// @lc code=end

