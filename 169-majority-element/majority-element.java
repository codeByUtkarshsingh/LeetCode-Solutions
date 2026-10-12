class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i:nums){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }else{
                hm.put(i,1);
            }
        }
        Set<Integer> keySet = hm.keySet();
        for(Integer key : keySet){
            if(hm.get(key)>(nums.length/2)){
                return key;
            }
        }
        return -1;
    }
}