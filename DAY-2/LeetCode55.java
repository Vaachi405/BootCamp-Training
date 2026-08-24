class Solution {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the maximum reach, you're stuck
            if (i > maxReach) {
                return false;
            }
            // Update the maximum index reachable so far
            maxReach = Math.max(maxReach, i + nums[i]);
            
            // Early exit if we can already reach or pass the last index
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}