class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int ssum=source[0]+source[1];
        int tsum=target[0]+target[1];
        if((tsum%2==0 && ssum%2!=0) || (tsum%2!=0 && ssum%2==0)){
            return -1;
        }
        if(Math.abs(source[0]-target[0])==Math.abs(source[1]-target[1])){
            return 1;
        }
        return 2;
        
    }
}