class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        int[] freq = new int[nums[nums.length-1]+1];
        int[] val = new int[nums[nums.length-1]+1];
        Arrays.fill(val,-1);
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        int sum = max(freq,val,1);
        return sum;
    }
    public int max(int[] num,int [] v,int i){
        if(i>=num.length){
            return 0;
        }
        if(v[i]!=-1){
            return v[i];
        }
        int inc = (num[i]*i)+max(num,v,i+2);
        int ninc = max(num,v,i+1);
        v[i] = Math.max(inc,ninc);
        return v[i];
    }
    
}