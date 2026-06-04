class Solution {
    public int totalWaviness(int num1, int num2) {
        int ans = 0;
        for (int num = num1; num <= num2; num++) {
            ans += waviness(num);
        }
        return ans;
    }
    private int waviness(int num) {
        int[] d = new int[10];
        int len = 0;
        while (num > 0) {
            d[len++] = num % 10;
            num /= 10;
        }
        if (len < 3) return 0;
        int count = 0;
        for (int i = 1; i < len - 1; i++) {
            if ((d[i] > d[i - 1] && d[i] > d[i + 1]) ||
                (d[i] < d[i - 1] && d[i] < d[i + 1])) {
                count++;
            }
        }
        return count;
    }
}