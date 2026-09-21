class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return path(grid,0,0,dp);
    }
    public int path(int[][] g,int i,int j,int[][] dp){
        if(i==g.length-1 && j==g[0].length-1){
            return g[i][j];
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int d = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;
        if(i+1<g.length){
            d = g[i][j] + path(g,i+1,j,dp);
        }
        if(j+1<g[0].length){
            r = g[i][j] + path(g,i,j+1,dp);
        }
        return dp[i][j] = Math.min(d,r);
    }
}