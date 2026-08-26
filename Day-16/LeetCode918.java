class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currMax = 0;

        int minSum = Integer.MAX_VALUE;
        int currMin = 0;

        int total = 0;

        for(int i=0;i<nums.length;i++){
            total += nums[i];

            currMax += nums[i];
            maxSum = Math.max(maxSum,currMax);
            if(currMax<0) currMax=0;

            currMin += nums[i];
            minSum = Math.min(minSum,currMin);
            if(currMin>0) currMin=0;
        }

        if(total == minSum) return maxSum;

        return Math.max(maxSum,total-minSum);
    }
}