class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                index=i;
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(max!=nums[i]){
                int t=nums[i]*2;
                if(t>max){
                    return -1;
                }
            }
        }
        return index;
    }
}