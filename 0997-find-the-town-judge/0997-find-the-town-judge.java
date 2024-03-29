class Solution {
    public int findJudge(int n, int[][] trust) {
       int tc[]=new int[n+1];
        int t[]=new int[n+1];
        for(int i=0;i<trust.length;i++){
            tc[trust[i][1]]++;
            t[trust[i][0]]=1;
        }
        for(int i=1;i<=n;i++){
            if(tc[i]>=n-1 && t[i]!=1){
                return i;
            }
        }
        return -1;
    }
}