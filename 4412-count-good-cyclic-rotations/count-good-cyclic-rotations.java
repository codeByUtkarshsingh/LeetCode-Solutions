class Solution {
    public int countGoodRotations(int[] nums) {
        int count =0;
        long totalSum = 0;
        int n = nums.length;
        int k = n/2;
        for(int i=0;i<n;i++){
            totalSum+=nums[i];
        }
        long firstSum = 0;
        for(int i=0;i<k;i++){
            firstSum+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(firstSum>(totalSum-firstSum)){
                count++;
            }
            
                firstSum = firstSum-nums[i]+nums[(i+k)%n];
            
        }
        return count;
    }
}