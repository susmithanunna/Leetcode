class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans=0;
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<=i;j++){
                if(nums[i]>nums[j]){
                    if(dp[i]<1+dp[j]){
                        dp[i]=1+dp[j];
                    }
                }
            }
            ans=(int)Math.max(ans,dp[i]);
        }
        if(n==1){
            return 1;
        }
        
        return ans;
    }
}