class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> s= new LinkedHashSet<>();
        for(char ch: word.toCharArray()){
            s.add(ch);
        }
        int c=0;
        for(Character ch : s){
            if(ch>='a' && ch<='z'){
                if(s.contains((char)(ch-' '))){
                    c++;
                }
            }
        }
        return c;
    }
}