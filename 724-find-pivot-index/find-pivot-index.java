class Solution {
    public int pivotIndex(int[] nums) {
        int ls[]=new int[nums.length];
        int rs[]=new int[nums.length];
        ls[0]=0;
        rs[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            ls[i]=ls[i-1]+nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            rs[i]=rs[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            if(ls[i]==rs[i]){
                return i;
            }
        }
        return -1;
    }
}