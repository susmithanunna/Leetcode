class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int k=0;
        int l=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[k]=nums[i];
                k=k+2;
            }
            else{
                ans[l]=nums[i];
                l=l+2;
            }
        }
        return ans;
    }
}