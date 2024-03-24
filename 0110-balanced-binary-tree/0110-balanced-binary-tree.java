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
    public boolean isBalanced(TreeNode root) {
        if(height(root)==-1){
            return false;
        }
        return true;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        if(l==-1 || r==-1){
            return -1;
        }
        if((int)Math.abs(l-r)>1){
            return -1;
        }
        return (int)Math.max(l,r)+1;
    }
}