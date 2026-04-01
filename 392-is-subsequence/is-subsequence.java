class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            int idx = t.indexOf(c, j);

            if(idx == -1) return false;

            j = idx + 1;
        }
        return true;
    }
}