class Solution {
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b) -> a.length()-b.length());
        int n = words.length;
        int max = 1;
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        for(int i = 0;i<n;i++){
            for(int j=0;j<i;j++){
                if(check(words[i],words[j]) && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                }
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
    public boolean check(String s1, String s2){
        if(s1.length() != s2.length() +1) return false;
        int i = 0;
        int j = 0;
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j == s2.length();
    }
}