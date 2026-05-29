class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
        }
        return Arrays.stream(nums).min().getAsInt();
    }
    int sum(int a){
        int r=0;
        for(int i=a;i>0;i/=10){
            r+=i%10;
        }
        return r;
    }
}