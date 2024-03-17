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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        boolean flag=false;
        while(!q1.isEmpty()){
            int size=q1.size();
            ArrayList<Integer> a1=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=q1.remove();
                a1.add(temp.val);
                  if(temp.right!=null){
                    q1.add(temp.right);
                }
                if(temp.left!=null){
                    q1.add(temp.left);
                }
               
               
            }
            if(flag){
                ans.add(a1);
            }
            else{
                Collections.reverse(a1);
                ans.add(a1);
            }
            flag=!flag;
        }
        return ans;
    }
}