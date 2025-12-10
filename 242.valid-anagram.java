/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
import java.util.HashMap;

class Solution{
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> MapS = new HashMap<>();
        HashMap<Character, Integer> MapT = new HashMap<>();
        
        for(char c : s.toCharArray()){
            MapS.put(c, MapS.getOrDefault(c,0) + 1);
        }

        for(char c : t.toCharArray()){
            MapT.put(c, MapT.getOrDefault(c,0) + 1);
        }
        
        return MapS.equals(MapT);        
    }
}
// @lc code=end

