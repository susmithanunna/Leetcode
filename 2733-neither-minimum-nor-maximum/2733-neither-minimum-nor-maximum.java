class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==1 || n==2){
            return -1;
        }
        return nums[n-2];
    }
}