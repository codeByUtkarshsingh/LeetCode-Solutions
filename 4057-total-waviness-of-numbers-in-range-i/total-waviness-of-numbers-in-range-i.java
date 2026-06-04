class Solution {
    public int totalWaviness(int num1, int num2) {
        int c=0;
        for(int i=num1;i<=num2;i++){
            char[] arr = String.valueOf(i).toCharArray();
            int j=1;
            while(j<arr.length-1){
                if((arr[j]>arr[j+1] && arr[j]>arr[j-1]) || (arr[j]<arr[j+1] && arr[j]<arr[j-1]))
                c++;
                j++;
            }
        }
        return c;
    }
}