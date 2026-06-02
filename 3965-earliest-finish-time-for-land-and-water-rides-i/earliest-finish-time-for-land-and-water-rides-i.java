class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,int[] waterStartTime, int[] waterDuration) {
        int s = Integer.MAX_VALUE;
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                int t1 = landStartTime[i] + landDuration[i];
                t1 = Math.max(t1, waterStartTime[j]);
                t1 += waterDuration[j];
                int t2 = waterStartTime[j] + waterDuration[j];
                t2 = Math.max(t2, landStartTime[i]);
                t2 += landDuration[i];
                s = Math.min(s, Math.min(t1, t2));
            }
        }
        return s;
    }
}