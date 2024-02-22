class Pair{
    int row;
    int col;
    int val;
    Pair(int _row,int _col,int _val){
        this.row=_row;
        this.col=_col;
        this.val=_val;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int cf=0;
        int n1=grid.length;
        int n2=grid[0].length;
        int vis[][]=new int[n1][n2];
        Queue<Pair> q=new LinkedList<>();
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(grid[i][j]==1){
                    cf++;
                }
                if(grid[i][j]==2){
                    vis[i][j]=2;
                    q.add(new Pair(i,j,0));  
                }
                else{
                    vis[i][j]=0;
                }
            }
        }
        int ans=0;
        int c1=0;
        int delrow[]={-1,+1,0,0};
        int delcol[]={0,0,-1,+1};
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int v=q.peek().val;
            q.remove();
            ans=(int)Math.max(ans,v);
            for(int i=0;i<4;i++){
                int nrow=delrow[i]+r;
                int ncol=delcol[i]+c;
                if((nrow>=0 && nrow<n1)&&(ncol>=0 && ncol<n2)){
                    if(vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                        q.add(new Pair(nrow,ncol,v+1));
                        c1++;
                        vis[nrow][ncol]=2;
                    }
                }
            }
        }
        if(c1!=cf){
        return -1;
       }
        return ans;
    }
    

    
}
