class Solution {
    public int search(int[] nums, int target) {
       return binarySearch(nums,target,0,nums.length-1);
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
