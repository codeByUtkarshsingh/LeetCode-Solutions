class Solution {
    public int reverseDegree(String s) {
        int[] value = new int[26];
        int c=26;
        for(int i=0;i<26;i++){
            value[i] = c--;
        }
        c=0;
        for(int i=0;i<s.length();i++){
            c+= value[s.charAt(i)-'a']*(i+1);
        }
        return c;
    }
}