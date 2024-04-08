class Solution {
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        long dp[][]=new long[n+1][n+1];
        long ans=find(piles,0,n-1,dp);
        if(ans!=0){
            return true;
        }
        return false;
    }
    public long find(int piles[],int left,int right,long dp[][]){
        if(left>right){
            return 0;
        }
        if(left==right){
            return piles[left];
        }
        if(dp[left][right]!=0){
            return dp[left][right];
        }
        long l=piles[left]+(long)Math.min(find(piles,left+2,right,dp),find(piles,left+1,right-1,dp));
    long r=piles[right]+(long)Math.min(find(piles,left+1,right-1,dp),find(piles,left,right-2,dp));
        return dp[left][right]=(long)Math.max(l,r);
    }
}