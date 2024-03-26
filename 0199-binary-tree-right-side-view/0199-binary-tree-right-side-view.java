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
    List<Integer> ans=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
          preOrder(root,0);
       return ans;
    }
    void preOrder(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(level==ans.size()){
            ans.add(root.val);
        }
        preOrder(root.right,level+1);
        preOrder(root.left,level+1);
    }
}