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
    Integer prev=null;
    public boolean isValidBST(TreeNode root) {
        if(root==null ||( root.left==null && root.right==null)){
            return true;
        }
        return inOrder(root);
    }
    public boolean inOrder(TreeNode root){
        if(root!=null){
        if(!inOrder(root.left)){
            return false;
        }
  
      if(prev!=null && prev>=root.val ){
            return false;
        }
       prev=root.val;
        if(!inOrder(root.right)){
            return false;
        }
        }
        return true;
        
    }
}
// Integer.MIN_VALUE represents the smallest value that can be stored in a variable of type int in Java. It is a constant defined in the Integer class and has a value of -2^31, which is -2147483648.

