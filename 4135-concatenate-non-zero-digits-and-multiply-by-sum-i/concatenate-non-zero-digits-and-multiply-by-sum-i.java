class Solution {
    public long sumAndMultiply(int n) {
        Stack<Integer> s = new Stack<>();
        long x=0,sum=0;
        for(int i=n;i>0;i/=10){
            if(i%10!=0){
                sum+=i%10;
                s.push(i%10);
            }         
        }
        if(sum==0) return 0;
        else{
           while(!s.isEmpty()){
            x=x*10+s.pop();
           } 
        }
        return x*sum;
    }
}
