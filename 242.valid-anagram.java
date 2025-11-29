/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
Import java.util.HashMap;

class Solution1 {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Charactor, Integer> MapS = new HashMap<>();
        HashMap<Charactor, Integer> MapT = new HashMap<>();

        for(char c : s.toCharArray()){
            MapS.put(c, MapS.getOrDefault(c, 0) + 1);
        } 

        for(char c : t.toCharArray()){
            MapT.put(c, MapT.getOrDefault(c, 0) + 1);
        }

        return MapS.equals(MapT);
        
    }
}

class Solution2 {
    public boolean isAnagram1(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Charactor, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c ,0) - 1);
        }

        for(int count : map.values()){
            if(count != 0){
                return fause;
            }
        }
    }
}
// @lc code=end

