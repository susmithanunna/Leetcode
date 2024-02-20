class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        boolean dp[]=new boolean[n+1];
        int max=0;
        for(int i=0;i<wordDict.size();i++){
            max=(int)Math.max(max,wordDict.get(i).length());
        }
        dp[0]=true;
        for(int i=0;i<=n;i++){
            //for(int j=0;j<i;j++){  or
            for(int j=i-1;j>=0;j--){
                if(i-j>max){
                    continue;
                }
                if(dp[j] && wordDict.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}