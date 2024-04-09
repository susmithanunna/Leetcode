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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){
            return null;
        }
        ArrayList<Integer> small=new ArrayList<>();
        ArrayList<Integer> large=new ArrayList<>();
        int node=preorder[0];
        for(int i=1;i<preorder.length;i++){
            if(preorder[i]>node){
                large.add(preorder[i]);
            }
            else{
                small.add(preorder[i]);
            }
        }
        int s[]=new int[small.size()];
        int l[]=new int[large.size()];
        for(int i=0;i<small.size();i++){
            s[i]=small.get(i);
        }
        for(int i=0;i<large.size();i++){
            l[i]=large.get(i);
        }
        
        TreeNode root=new TreeNode(node);
        root.left=bstFromPreorder(s);
        root.right=bstFromPreorder(l);
        return root;
    }
    
}