public static int lengthOfLIS(int[] nums) {
    int[] ans = new int[nums.length];
    int len = 0;

    for (int num : nums) {
        int idx = Arrays.binarySearch(ans, 0, len, num);
        if (idx < 0) {
            idx = -(idx + 1);
        }
        ans[idx] = num;
        if (idx == len) {
            len++;
        }
    }

    return len;
}