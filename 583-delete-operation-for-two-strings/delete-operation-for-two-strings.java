class Solution {
    public int minDistance(String word1, String word2) {
        int i = word1.length();
        int j = word2.length();
        int[][] dp = new int[i][j];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return (i+j)-(2*calc(word1,word2,i-1,j-1,dp));
    }
    public int calc(String s1,String s2,int i,int j,int[][] dp){
        if(i<0||j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return 1+calc(s1,s2,i-1,j-1,dp);
        }
        int first = calc(s1,s2,i-1,j,dp);
        int second = calc(s1,s2,i,j-1,dp);
        return dp[i][j] = Math.max(first,second);
    }
}