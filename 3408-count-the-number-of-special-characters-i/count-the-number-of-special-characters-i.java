class Solution {
    public int numberOfSpecialChars(String word) {
        int c=0;
        boolean[] l = new boolean[26];
        boolean[] u = new boolean[26];
        for(char ch: word.toCharArray()){
            if(Character.isLowerCase(ch)){
                l[ch-'a']=true;
            }
            else{
                u[ch-'A']=true;
            }
        }
        for(int i=0;i<26;i++){
            if(l[i] && u[i]){
                c++;
            }
        }
        return c;
    }
}