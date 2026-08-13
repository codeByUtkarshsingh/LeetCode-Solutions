class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int maxf = -1;
        for(int i : map.keySet()){
            if(map.get(i)>maxf) maxf = map.get(i);
        }
        int n=0;
        for(int i : map.keySet()){
            if(map.get(i)==maxf){
                n+=map.get(i);
            }
        }
        return n;
    }
}