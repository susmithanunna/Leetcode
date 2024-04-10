class Solution {
    public int rob(int[] nums) {
        // int n=nums.length;
        // int dp[]=new int[n+1];
        // dp[0]=0;
        // dp[1]=nums[0];
        // for(int i=2;i<=n;i++){
        //     dp[i]=(int)Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        // }
        // return dp[n];
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int prev=(int)Math.max(nums[0],nums[1]);
        int sprev=nums[0];
        for(int i=2;i<n;i++){
            int pick=nums[i]+sprev;
            int notpick=0+prev;
            sprev=prev;
            prev=(int)Math.max(pick,notpick);
        }
        return prev;
        
    }
}