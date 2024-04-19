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
    public int countNodes(TreeNode root) {
       if(root==null){
           return 0;
       }
        Queue<TreeNode> q1=new LinkedList<>();
        q1.add(root);
        int c=0;
        while(!q1.isEmpty()){
            TreeNode temp=q1.remove();
            c++;
            if(temp.left!=null){
                q1.add(temp.left);
                
            }
            if(temp.right!=null){
                q1.add(temp.right);
                
            }
        }
        return c;
    }
}