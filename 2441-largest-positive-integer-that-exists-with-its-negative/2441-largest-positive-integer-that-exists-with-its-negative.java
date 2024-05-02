class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        int maxi=-1;
        while(l<=r){
            int t=nums[l]+nums[r];
            if(t==0){
                maxi=(int)Math.max(maxi,nums[r]);
                r--;
                l++;
            }
            else if(t>0){
                r--;
            }
            else{
                l++;
            }
        }
        return maxi;
    }
}