class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        long curr=mass;
        Arrays.sort(asteroids);
        int i = 0;
        while (i < asteroids.length) {
            if (curr >= asteroids[i]) {
                curr += asteroids[i];
            } else {
                return false;
            }
            i++;
        }
        return true;
    }
    
}