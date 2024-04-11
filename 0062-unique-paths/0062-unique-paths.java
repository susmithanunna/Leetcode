class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    continue;
                }
                int right=0;
                int down=0;
                if(j>0){
                    right=dp[i][j-1];
                }
                if(i>0){
                    down=dp[i-1][j];
                }
                dp[i][j]=right+down;
            }
        }
        return dp[m-1][n-1];
    }
    // public int find(int i,int j){
    //     if(i==0 && j==0){
    //         return 1;
    //     }
    //     if(i<0 || j<0){
    //         return 0;
    //     }
    //     int left=find(i,j-1);
    //     int up=find(i-1,j);
    //     return up+left;
    // }
}