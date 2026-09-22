class Solution {
    public int minFallingPathSum(int[][] matrix) {
       int[] v = new int[matrix.length];
       int[][] dp = new int[matrix.length][matrix[0].length];
       for(int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
       int f = Integer.MAX_VALUE;
       for(int i=0;i< matrix.length;i++){
            f = Math.min(f,rowsum(matrix,0,i,dp));
       }
       return f;
    }
    public int rowsum(int[][] m,int i, int j,int[][] dp){
        if(i==m.length-1){
            return m[i][j];
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int d = Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;
        if(i<m.length-1) d = m[i][j] + rowsum(m,i+1,j,dp);
        if(j<m[0].length-1) r = m[i][j] + rowsum(m,i+1,j+1,dp);
        if(j>0) l = m[i][j] + rowsum(m,i+1,j-1,dp);
        return dp[i][j] = Math.min(Math.min(d,r),l);
    }
}