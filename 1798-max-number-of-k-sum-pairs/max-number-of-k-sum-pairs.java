class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int c=0;
        while(i<j){
            int s=nums[i]+nums[j];
            if(s==k){
                c++;
                j--;
                i++;
            }else if(s>k){
                j--;
            }else{
                i++;
            } 
            
        }
        return c;
    }
}