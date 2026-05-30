class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,z=0,c=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                z++;
            }
            while(z>1){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            c=Math.max(c,r-l);
        }
        return c;
    }
}