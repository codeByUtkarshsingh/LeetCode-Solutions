class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int x: arr){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        Set<Integer> s= new HashSet<>();
        for(int x : map.values()){
            if(s.contains(x)){
                return false;
            }
            else{
                s.add(x);
            }
        }
        return true;
    }
}