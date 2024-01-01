class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        boolean vis[]=new boolean[isConnected.length];
        for(int i=0;i<isConnected.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                } 
            }
        }
        int c=0;
        for(int i=0;i<isConnected.length;i++){
            if(vis[i]==false){
                c++;
                dfs(i,vis,adj);
            }
        }
        return c;
    }
    public void dfs(int node,boolean vis[],ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int it:adj.get(node)){
            if(!vis[it]){
                dfs(it,vis,adj);
            }
        }
        
    }
}