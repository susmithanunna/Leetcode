class Solution {
    public void solve(char[][] board) {
        int n1=board.length;
        int n2=board[0].length;
        int vis[][]=new int[n1][n2];
        int delrow[]={-1,0,0,+1};
        int delcol[]={0,-1,+1,0};
        for(int j=0;j<n2;j++){
            if(board[0][j]=='O' && vis[0][j]==0){
                dfs(0,j,vis,board,delrow,delcol);
            }
            if(board[n1-1][j]=='O' && vis[n1-1][j]==0){
                dfs(n1-1,j,vis,board,delrow,delcol);
            }
        }
        for(int i=0;i<n1;i++){
            if(board[i][0]=='O' && vis[i][0]==0){
                dfs(i,0,vis,board,delrow,delcol);
            }
            if(board[i][n2-1]=='O' && vis[i][n2-1]==0){
                dfs(i,n2-1,vis,board,delrow,delcol);
            }
        }
      for(int i=0;i<n1;i++){
          for(int j=0;j<n2;j++){
              if(vis[i][j]==0 && board[i][j]=='O'){
                  board[i][j]='X';
              }
          }
      }
                        
    }
    public void dfs(int row,int col,int vis[][],char board[][],int delrow[],int delcol[]){
          if (board == null || board.length == 0 || board[0].length == 0) {
            return; // Empty board, nothing to process
        }
        vis[row][col]=1;
        int n1=board.length;
        int n2=board[0].length;
        for(int i=0;i<4;i++){
            int nrow=delrow[i]+row;
            int ncol=delcol[i]+col;
            if(nrow>=0 && nrow<n1 && ncol>=0 && ncol<n2 && vis[nrow][ncol]==0 && board[nrow][ncol]=='O'){
                dfs(nrow,ncol,vis,board,delrow,delcol);
            }
        }
    }
}