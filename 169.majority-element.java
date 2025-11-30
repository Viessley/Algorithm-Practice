/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
Import java.util.HashMap;

class Solution { // 114 ms Runtime. Time O(n) Space O(n)
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        //first loop: to build a map
        for(int e : nums){
            map.put(e, map.getOrDefault(e, 0)+ 1);// <- This is the killer! map.put()
        }
        /*The 6 Steps:
                1. Calculate Hash
                javahash = key.hashCode() ^ (key.hashCode() >>> 16)
                // Convert key to integer index
                // Cost: ~10-20 CPU cycles
                2. Find Bucket Position
                javaindex = hash & (table.length - 1)
                // Map hash to array index
                // Cost: ~2-3 CPU cycles
                3. Check if Resize Needed
                javaif (size >= threshold) resize();
                // threshold = capacity × 0.75
                // Cost: ~5 cycles (check only)
                4. Resize & Rehash (if needed)
                java// Double array size: 16 → 32
                // Recalculate ALL existing elements' positions
                // Cost: O(n) - EXPENSIVE!
                5. Handle Hash Collision
                java// If bucket already has element:
                // - Use LinkedList (if chain < 8)
                // - Use Red-Black Tree (if chain ≥ 8)
                // Cost: O(1) to O(log n)
                6. Store Key-Value
                javaNode newNode = new Node(hash, key, value, next);
                table[index] = newNode;
                size++;
                // Create object on heap
                // Cost: ~50-100 cycles

                ⚡ Total Cost Per Operation:
                Normal case: ~95-175 CPU cycles
                With resize: 10,000+ CPU cycles
                vs Boyer-Moore: ~5 CPU cycles
                That's why HashMap is 20-35x slower!
                */

        //second loop: to get the entry pair
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() > (nums.length/2)){
                return entry.getKey();
            }
        }
    }
}

class Solution1 { // 1 ms Runtime. Time O(n) Space O(1)
    public int majorityElement(int[] nums) {
        int i;
        int majorityElement = nums[0];
        int count = 1;

        for(i = 1; i < nums.length; i++){
            if(count == 0){
                majorityElement = nums[i];
                count++;
            }
            
            else if(nums[i] == majorityElement){
                count++;
            }
            else{
                count--;
            }
        }
        return majorityElement;
    }
}

/*"O(n) is not equal to O(n)!"
Big O notation only describes the growth rate, not the actual runtime.
Two O(n) algorithms can have vastly different performance because:
HashMap approach: O(n) = n × 50 operations

Hash calculation
Collision handling
Memory allocation
Random memory access

Boyer-Moore approach: O(n) = n × 3 operations

Simple comparison
Addition/subtraction
Sequential memory access

Result: Both are O(n), but Boyer-Moore is 10-50x faster in practice!
Key point: Big O ignores constant factors and lower-order terms, but these matter greatly in real-world performance.
Think of it like: "O(n) tells you the shape of the curve, not the actual speed."
*/
// @lc code=end

