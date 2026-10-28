class Solution {
    public int minInsertions(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] r: dp){
            Arrays.fill(r,-1);
        }
        return palindrome(s,0,s.length()-1,dp);
    }
    public int palindrome(String s,int i, int j, int[][] dp){
        if(i>=j) {
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j] = (0+palindrome(s,i+1,j-1,dp));
        }else{
            return dp[i][j] = Math.min((1+palindrome(s,i+1,j,dp)),(1+palindrome(s,i,j-1,dp)));
        }
        
    }
}