class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int i = triangle.size();
        int j = triangle.get(i-1).size();
        int[][] dp = new int[i][j];  
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int ps = path(triangle,0,0,dp);
        return ps;
    }
    public int path(List<List<Integer>> t,int i, int j, int[][] dp){
        if(i==t.size()-1){
            return t.get(i).get(j);
        }
        if(dp[i][j]!=Integer.MAX_VALUE){
            return dp[i][j];
        }
        int d = Integer.MAX_VALUE;
        int r = Integer.MAX_VALUE;
        if(i<t.size()){
            d = t.get(i).get(j) + path(t,i+1,j,dp);
        }
        if(i<t.size() && j<t.get(i).size()){
            r = t.get(i).get(j) + path(t,i+1,j+1,dp);
        }
        return dp[i][j] = Math.min(d,r);
    }
}