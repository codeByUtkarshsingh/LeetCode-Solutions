class Solution {
    public int maxArea(int[] height) {
        int i =0;
        int j=height.length-1;
        int a=0;
        while(i<j){
            int b=Math.min(height[i],height[j]);
            int cur=b*(j-i);
            if(height[i]>height[j]){
                j--;
            } else{
                i++;
            }
            a=Math.max(cur,a);
        }
        return a;
    }
}