import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        backtrack(candidates, target, 0, ans, curr);
        return ans;
    }

    private void backtrack(int[] candidates, int target, int idx, List<List<Integer>> ans, List<Integer> curr) {
        // Base case: target reached
        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // Base case: target exceeded or array fully traversed
        if (target < 0 || idx >= candidates.length) {
            return;
        }

        // Include the current element (stay at `idx` since elements can be reused)
        curr.add(candidates[idx]);
        backtrack(candidates, target - candidates[idx], idx, ans, curr);
        curr.remove(curr.size() - 1); // Backtrack

        // Exclude the current element and move to the next candidate
        backtrack(candidates, target, idx + 1, ans, curr);
    }
}