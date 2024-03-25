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
    public int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        height(root);
        return ans;
    }
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int l=(int)Math.max(0,height(root.left));
        int r=(int)Math.max(0,height(root.right));
        ans=(int)Math.max(ans,(l+r+root.val));
        return root.val+(int)Math.max(l,r);
    }
}