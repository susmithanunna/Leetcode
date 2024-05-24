class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target=sum/2;
        boolean dp[][]=new boolean[n][target+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        if(nums[0]<=target){
            dp[0][nums[0]]=true;
        }
        for(int i=1;i<n;i++){
            for(int tar=1;tar<=target;tar++){
                boolean nottake=dp[i-1][tar];
                boolean take=false;
                if(nums[i]<=tar){
                    take=dp[i-1][tar-nums[i]];
                }
                dp[i][tar]=take||nottake;
            }
        }
        return dp[n-1][target];
    }
}