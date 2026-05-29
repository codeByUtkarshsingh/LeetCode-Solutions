class Solution {
    public int minElement(int[] nums) {
        int min= Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
            if(nums[i]<min){
                min= nums[i];
            }
        }
        return min;
    }
    int sum(int a){
        int r=0;
        for(int i=a;i>0;i/=10){
            r+=i%10;
        }
        return r;
    }
}