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
    public boolean checkTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left==null && root.right==null){
            return true;
        }
        int l=0;
        int r=0;
        if(root.left!=null){
            l=l+root.left.val;
        }
        if(root.right!=null){
            r=r+root.right.val;
        }
        if(l+r==root.val && checkTree(root.left) && checkTree(root.right)){
            return true;
        }
        return false;
    }
}