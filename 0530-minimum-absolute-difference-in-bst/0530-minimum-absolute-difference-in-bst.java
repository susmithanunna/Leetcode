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
    int min=Integer.MAX_VALUE;
    int prev=-1;
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inOrder(root,ans);
        return min;
    }
    public void inOrder(TreeNode root,ArrayList<Integer> ans){
        if(root!=null){
            inOrder(root.left,ans);
            if(prev!=-1){
                int t=root.val-prev;
                min=(int)Math.min(min,t);
            }
            prev=root.val;
            inOrder(root.right,ans);
        }
    }
}