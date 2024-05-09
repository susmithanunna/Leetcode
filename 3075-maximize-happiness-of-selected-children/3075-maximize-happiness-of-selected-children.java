class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n=happiness.length;
        Arrays.sort(happiness);
        int c=0;
        long ans=0;
        for(int i=n-1;i>=n-k;i--){
            happiness[i]=(int)Math.max(happiness[i]-c,0);
            c++;
            ans=ans+happiness[i];
        }
        return ans;
        
    }
}