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
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q1=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        q1.add(root);
        while(!q1.isEmpty()){
            int n=q1.size();
            List<Integer> a1=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode t=q1.remove();
                if(t.left!=null){
                    q1.add(t.left);
                   // a1.add(t.data);
                }
                if(t.right!=null){
                    q1.add(t.right);
                   // a1.add(t.data)
                }
                a1.add(t.val);
            }
            ans.add(a1);
        }
        return ans;
    }
}