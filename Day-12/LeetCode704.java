class Solution {
    public int search(int[] nums, int target) {
        int lb = 0;
        int ub = nums.length - 1;
        while(lb <= ub){
            int mid = lb + (ub - lb) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                ub = mid - 1;
            }else{
                lb = mid + 1;
            }
        }
        return -1;
    }
}