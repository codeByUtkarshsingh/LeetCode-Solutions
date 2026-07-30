class Solution {
    public int search(int[] nums, int target) {
        int pivot=0;
        if(nums.length==1){
            if(target == nums[0]){
                return 0;
            }else{
                return -1;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                pivot = i+1;
            }
        }
        if(pivot == 0){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(target<=nums[nums.length-1]){
            return binarySearch(nums,target,pivot,nums.length-1);
        }else{
            return binarySearch(nums,target,0,pivot-1);
        }
    }
    public int binarySearch(int[] n, int t, int s, int e){
        int mid = (s+e)/2;
        if(s>e){
            return -1;
        }
        if(n[mid]==t){
            return mid;
        }else if(n[mid]<t){
            return binarySearch(n,t,mid+1,e);
        }else{
            return binarySearch(n,t,s,mid-1);
        }
    }
}