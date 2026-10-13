class Solution {
    public int equalPairs(int[][] grid) {
        int c = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid.length;j++){
                int k = 0;
                while(k<grid.length){
                    if(grid[i][k]!=grid[k][j]){
                        break;
                    }
                    k++;
                }
                if(k==grid.length){
                    c++;
                }
            }
        }
            
        return c;
    }
}