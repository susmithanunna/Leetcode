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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        inOrder(root,ans);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ans.size()-1;i++){
            if(min>(ans.get(i+1)-ans.get(i))){
                min=ans.get(i+1)-ans.get(i);
            }
        }
        return min;
    }
    public void inOrder(TreeNode root,ArrayList<Integer> ans){
        if(root!=null){
            inOrder(root.left,ans);
            ans.add(root.val);
            inOrder(root.right,ans);
        }
    }
}