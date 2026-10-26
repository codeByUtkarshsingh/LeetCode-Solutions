class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        return value(dungeon, 0, 0, dp);
    }

    public int value(int arr[][], int i, int j, int[][] dp) {
        int m = arr.length;
        int n = arr[0].length;
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }
        if (i == m - 1 && j == n - 1) {
            return Math.max(1, 1 - arr[i][j]);
        }
        int d = value(arr, i + 1, j, dp);
        int r = value(arr, i, j + 1, dp);
        int min = Math.min(d, r);
        return dp[i][j] = Math.max(1, min - arr[i][j]);

    }
}