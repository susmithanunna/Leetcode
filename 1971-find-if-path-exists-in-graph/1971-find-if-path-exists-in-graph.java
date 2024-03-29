class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean vis[]=new boolean[n];
        int c=destination-source;
        int ct=0;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        //int f=dfs(source,adj,vis);
//         for(int i=source;i<=destination;i++){
//             if(!vis[i]){
//                 f=dfs(i,adj,vis);
//             }
//         }
        ArrayList<Integer> a1=new ArrayList<>();
        dfs(source,adj,vis,a1);
        for(int i=0;i<a1.size();i++){
            System.out.print(a1.get(i)+" ");
        }
        if(a1.contains(destination)){
            return true;
        }
        return false;
    }
    public void dfs(int v,ArrayList<ArrayList<Integer>> adj,boolean vis[],ArrayList<Integer> a1){
        vis[v]=true;
      a1.add(v);
        for(Integer it:adj.get(v)){
            //System.out.println("dfs::"+it);
            if(!vis[it]){
               // c=it;
                dfs(it,adj,vis,a1);
            }
        }
        
    }
}