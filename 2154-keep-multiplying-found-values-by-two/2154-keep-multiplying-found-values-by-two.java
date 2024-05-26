class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int ans=original;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==ans){
                ans=nums[i]*2;
            }
        }
        return ans;
    }
}