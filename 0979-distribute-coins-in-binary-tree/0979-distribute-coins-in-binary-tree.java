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
    int steps=0;
    public int distributeCoins(TreeNode root) {
       find(root);
        return steps;
    }
    public int find(TreeNode root){
         if(root==null){
            return 0;
        }
        int left=find(root.left);
        int right=find(root.right);
        steps=steps+(int)Math.abs(left)+(int)Math.abs(right);
        return root.val+left+right-1;
    }
}
