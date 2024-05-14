class Solution {
    int dr[]={-1,0,0,1};
    int dc[]={0,-1,1,0};
    public int getMaximumGold(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    ans=(int)Math.max(ans,dfs(i,j,n,m,grid));
                }
                
            }
        }
        return ans;
    }
    public int dfs(int x,int y,int n,int m,int grid[][]){
        if(x<0 || y<0 || x>=n || y>=m || grid[x][y]==0){
            return 0;
        }
        int curr=grid[x][y];
        grid[x][y]=0;
        int localmax=curr;
        for(int i=0;i<4;i++){
            int nr=x+dr[i];
            int nc=y+dc[i];
            localmax=(int)Math.max(localmax,curr+dfs(nr,nc,n,m,grid));
        }
        grid[x][y]=curr;
        return localmax;
        
        
    }
}