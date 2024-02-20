class Solution {
    public int numIslands(char[][] grid) {
        int c=0;
        int vis[][]=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]=='1' && vis[i][j]==0){
                    c++;
                    dfs(i,j,vis,grid);
                }
            }
        }
        return c;
    }
    public static void dfs(int row,int col,int vis[][],char grid[][]){
        vis[row][col]=1;
        int n1=grid.length;
        int n2=grid[row].length;
        if((row-1>=0 && row-1<n1) && (col>=0 && col<n2)){
            if(grid[row-1][col]=='1' && vis[row-1][col]==0){
                dfs(row-1,col,vis,grid);
            }
        }
        if((row>=0 && row<n1) && (col-1>=0 && col-1<n2)){
            if(grid[row][col-1]=='1' && vis[row][col-1]==0){
                dfs(row,col-1,vis,grid);
            }
        }
        if((row>=0 && row<n1) && (col+1>=0 && col+1<n2)){
            if(grid[row][col+1]=='1' && vis[row][col+1]==0){
                dfs(row,col+1,vis,grid);
            }
        }
       if((row+1>=0 && row+1<n1) && (col>=0 && col<n2)){
            if(grid[row+1][col]=='1' && vis[row+1][col]==0){
                dfs(row+1,col,vis,grid);
            }
        }
        
        
    }
}