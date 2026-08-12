class Solution {
    public int[] countBits(int n) {
        int[] c = new int[n+1];
        for(int i=1;i<=n;i++){
            c[i] = count(i);
        }
        return c;
    }
    public int count(int a){
        int c=0;
        while(a>0){
            if((a & 1)!=0) c++;
            a = a>>1;
        }
        return c;
    }
}
