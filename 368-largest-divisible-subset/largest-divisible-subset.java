class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> l = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        Arrays.fill(dp,1);
        int[] p = new int[n];
        Arrays.fill(p,-1);
        int maxIdx = 0;
        int max = Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]%nums[j]==0 && dp[i]<dp[j]+1){
                    dp[i] = dp[j]+1;
                    p[i] = j;
                }
            }
            if(max<dp[i]){
                max = dp[i];
                maxIdx = i;
            }   
        }
        while(maxIdx!=-1){
            l.add(nums[maxIdx]);
            maxIdx = p[maxIdx];
        }
        return l;
    }
}    