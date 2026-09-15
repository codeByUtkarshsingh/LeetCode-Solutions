class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,-1);
        int total = sum(nums,0,dp);
        return total;
        }
    public int sum(int[] arr,int i,int[] store){
        if(i>=arr.length) {
            return 0;
        }
        if(store[i]!=-1){
            return store[i];
        }
        int inc = arr[i] + sum(arr,i+2,store);
        int ninc = sum(arr,i+1,store);
        return store[i] = Math.max(inc,ninc);
    }       
}