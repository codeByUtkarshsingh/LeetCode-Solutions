class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = (int)Math.pow(n,2);
        int sumEven = n+(int)Math.pow(n,2);
        return gcd(sumOdd,sumEven);
    }
    public int gcd(int a,int b){
        for(int i=(int)Math.sqrt(Math.min(a,b));i>=2;i--){
            if(a%i==0  && b%i==0) return i;
        }
        return 1;
    }

}