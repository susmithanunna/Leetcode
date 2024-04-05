/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair{
    TreeNode node;
    int ind;
    public Pair(TreeNode node,int ind){
        this.ind=ind;
        this.node=node;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
        Queue<Pair> q1=new LinkedList<>();
        q1.add(new Pair(root,0));
        while(!q1.isEmpty()){
            int n=q1.size();
            int first=0;
            int last=0;
            int min=q1.peek().ind;
            for(int i=0;i<n;i++){
                int curr_ind=q1.peek().ind-min;
                TreeNode node=q1.peek().node;
                q1.poll();
                if(i==0){
                   first=curr_ind;
                }
                if(i==n-1){
                    last=curr_ind;
                }
                if(node.left!=null){
                    q1.add(new Pair(node.left,curr_ind*2+1));
                }
                if(node.right!=null){
                    q1.add(new Pair(node.right,curr_ind*2+2));
                }
            }
            ans=(int)Math.max(ans,last-first+1);
        }
        return ans;
    }
    
}