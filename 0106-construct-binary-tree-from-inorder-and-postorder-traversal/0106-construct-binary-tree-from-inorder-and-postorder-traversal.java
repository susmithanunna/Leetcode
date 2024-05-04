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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length || inorder.length==0 || postorder.length==0){
            return null;
        }
        HashMap<Integer,Integer> h1=new HashMap<>();
        int n=inorder.length;
        for(int i=0;i<n;i++){
            h1.put(inorder[i],i);
        }
        return constructbinaryTree(inorder,0,n-1,postorder,0,n-1,h1);
    }
    public TreeNode constructbinaryTree(int inorder[],int is,int ie,int postorder[],int ps,int pe,HashMap<Integer,Integer> h1){
        if(is>ie  || ps>pe){
            return null;
        }
        TreeNode root=new TreeNode(postorder[pe]);
        int index=h1.get(postorder[pe]);
        int numsleft=index-is;
        root.left=constructbinaryTree(inorder,is,index-1,postorder,ps,ps+numsleft-1,h1);
        root.right=constructbinaryTree(inorder,index+1,ie,postorder,ps+numsleft,pe-1,h1);
        return root;
    }
}