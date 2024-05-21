/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }
        Queue<TreeNode> q1=new LinkedList<>();
        String ans="";
        q1.add(root);
        while(!q1.isEmpty()){
            TreeNode temp=q1.remove();
            if(temp==null){
                ans=ans+"n ";
                continue;
            }
            ans=ans+temp.val+" ";
            q1.add(temp.left);
            q1.add(temp.right);
            
        }
        return ans;
        
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==""){
            return null;
        }
        Queue<TreeNode> q1=new LinkedList<>();
        String values[]=data.split(" ");
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q1.add(root);
        for(int i=1;i<values.length;i++){
            TreeNode parent=q1.remove();
           if(!values[i].equals("n")){
               TreeNode left=new TreeNode(Integer.parseInt(values[i]));
               parent.left=left;
               q1.add(left);
           }
            if(!values[++i].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                parent.right=right;
                q1.add(right);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));