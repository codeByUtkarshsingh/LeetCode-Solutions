class Solution {
    public int lengthOfLIS(int[] nums) {
        int[][] dp = new int[nums.length][nums.length + 1];
        for (int r[] : dp) {
            Arrays.fill(r, -1);
        }
        return calc(0, -1, nums, dp);
    }

    public int calc(int i, int prev, int[] nums, int[][] dp) {
        if (i == nums.length) {
            return 0;
        }
        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }
        int take = 0;
        int skip = 0 + calc(i + 1, prev, nums, dp);
        if (prev == -1 || nums[i] > nums[prev]) {
            take = 1 + calc(i + 1, i, nums, dp);
        }
        return dp[i][prev + 1] = Math.max(take, skip);
    }
}