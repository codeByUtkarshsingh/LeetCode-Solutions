class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> s= new LinkedHashSet<>();
        ArrayList<Character> l = new ArrayList<>();
        
        for(char ch: word.toCharArray()){
            s.add(ch);
            l.add(ch);
        }
        int c=0;
        for(Character ch : s){
            if(ch>='a' && ch<='z'){
                if(s.contains((char)(ch-' ')) && l.lastIndexOf(ch)<l.indexOf((char)(ch-' '))){ // not checking for all small chracters
                    c++;
                }
            }
        }
        return c;
    }
}