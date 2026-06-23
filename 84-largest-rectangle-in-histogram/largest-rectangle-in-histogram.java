class Solution {
    public int largestRectangleArea(int[] heights) {
        int area=0;
        int max=0;
        int sr[] = new int[heights.length];
        int sl[] = new int[heights.length];
        Stack <Integer> s = new Stack<>();
        for(int i=heights.length-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                sr[i]=heights.length;
            }else{
                sr[i]=s.peek();
            }
            s.push(i);
        }
        s = new Stack<>();
        for(int i=0;i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()]>=heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                sl[i]=-1;
            }else{
                sl[i]=s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<heights.length;i++){
            area=heights[i]*(sr[i]-sl[i]-1);
            max=Math.max(max,area);
        }
           return max;
    }
}