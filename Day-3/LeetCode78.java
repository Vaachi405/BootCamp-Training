class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        sub(nums, 0, ans,curr);
        return ans;
    }
    public void sub(int[] nums, int idx, List<List<Integer>> ans, List<Integer> curr ){
        if(idx > nums.length - 1) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        sub(nums, idx + 1, ans, curr);
        curr.remove(curr.size() - 1);
        sub(nums, idx + 1, ans, curr);
    }
}