class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ls= new int[nums.length];
        ls[0]=0;
        int[] rs= new int[nums.length];
        rs[nums.length-1]=0;
        int i=1;
        int j=nums.length-2;
        while(i<nums.length){
            ls[i]=ls[i-1]+nums[i-1];
            rs[j]=rs[j+1]+nums[j+1];
            i++;
            j--;
        }
        i=0;
        int[] res= new int[nums.length];
        while(i<nums.length){
            res[i]=Math.abs(ls[i]-rs[i]);
            i++;
        }
        return res;
    }
}