class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        ArrayList<Integer> s= new ArrayList<>();
        ArrayList<Integer> l= new ArrayList<>();
        int c=0;
        for(int i: nums){
            if(i<pivot) s.add(i);
            else if(i>pivot) l.add(i);
            else c++;
        }
        while(c>0){
            s.add(pivot);
            c--;
        }
        s.addAll(l);
        for(int i=0;i<nums.length;i++){
            nums[i]=s.get(i);
        }
        return nums;         
    }
}