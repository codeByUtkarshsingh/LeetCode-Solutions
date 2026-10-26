class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int[] r : dp) {
            Arrays.fill(r, -1);
        }
        return solve(0, 0, dp);
    }

    public int solve(int i, int j, int[][] dp) {
        int m = dp.length-1;
        int n = dp[0].length-1;
        if (i > m || j > n)
            return 0;
        if (dp[i][j] != -1)
            return dp[i][j];
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        return dp[i][j] = (solve(i + 1, j, dp) + solve(i, j + 1, dp));
    }
}