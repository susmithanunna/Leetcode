class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int last=n-1;
        for(int i=n-2;i>=0;i--){
           int t=nums[i]+i;
            if(t>=last){
                last=i;
            }
        }
        if(last==0){
            return true;
        }
        return false;
    }
}