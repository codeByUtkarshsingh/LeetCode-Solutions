class Solution {
    public String[] largestString(int[] nums) {
        String[] x = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            x[i] = ans(nums[i]);
        }
        return x;
    }
    public String ans(int num){
        if(num==1){
            return "a";
        }
        String res = "";
        int c = 0;
        while(num/2>=1){
            if(c==25){
                while(num>0){
                    res = 'z' + res;
                    num--;
                }
                return res;
            }
            if(num%2==1){
                res = (char)('a'+c)+res;
            }
            num=num/2;
            c++;
        }
        return (char)('a' + (c)) + res;
    }
}