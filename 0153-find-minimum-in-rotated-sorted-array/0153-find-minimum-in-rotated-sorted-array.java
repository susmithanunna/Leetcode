class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        if(nums[s]<=nums[e]){
            return nums[0];
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==nums[s] && nums[mid]==nums[e]){
                return nums[s];
            }
            else if(nums[mid]>=nums[s] && nums[mid]>=nums[e]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return nums[s];
    }
}